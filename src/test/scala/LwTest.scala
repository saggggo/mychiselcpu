package top

import chisel3._
import org.scalatest._
import chiseltest._

class LwTest extends FlatSpec with ChiselScalatestTester {
    "mychiselcpu" should "work though hex" in {
        test(new Top) {c => 
            while (!c.io.exit.peek().litToBoolean) {
                c.clock.step(1)
            }
        }
    }
}