/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrdshinse.lerning.akka;

import akka.actor.UntypedActor;

/**
 *
 * @author mrdShinse
 */
public class SimpleActor extends UntypedActor {

    @Override
    public void onReceive(Object message) throws Exception {
        if (message instanceof String) {
            System.out.println("message:" + message);
        } else {
            System.out.println("unhandled message.");

            unhandled(message);
        }
    }

    @Override
    public void preStart() {
        System.out.println("preStart");
    }

    @Override
    public void postStop() {
        System.out.println("postStop");
    }

}
