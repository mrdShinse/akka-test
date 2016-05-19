/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrdshinse.lerning.akka;

import mrdshinse.lerning.akka.batch.Batch;
import mrdshinse.lerning.akka.batch.wha.BatchWithAkka;
import mrdshinse.lerning.akka.batch.woa.BatchWithoutAkka;

/**
 *
 * @author mrdShinse
 */
public class Invoker {

    public static void main(String[] args) {
        Batch batch = new BatchWithoutAkka();
        batch.execute();

        batch = new BatchWithAkka();
        batch.execute();
    }
}
//        ActorSystem system = ActorSystem.create("system");
//        ActorRef ref = system.actorOf(Props.create(SimpleActor.class), "simpleActor");
//        String message = "hello.";
//        ref.tell(message, null);
//
//        system.terminate();
//        System.out.println("end.");
