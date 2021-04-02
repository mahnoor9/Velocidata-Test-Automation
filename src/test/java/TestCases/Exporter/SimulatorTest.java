package TestCases.Exporter;

import org.junit.Test;
import tasks.simulator.SSHManager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SimulatorTest {

    @Test
    public void testSendCommand () {
        System.out.println ("sendCommand");

        /**
         * YOU MUST CHANGE THE FOLLOWING
         * FILE_NAME: A FILE IN THE DIRECTORY
         * USER: LOGIN USER NAME
         * PASSWORD: PASSWORD FOR THAT USER
         * HOST: IP ADDRESS OF THE SSH SERVER
         **/
        String command = "./push_samis.sh 10.2.2.39";
        String userName = "USER";
        String password = "PASSWORD";
        String connectionIP = "HOST";
        SSHManager instance = new SSHManager ();
        instance.connect ();

        // call sendCommand for each command and the output
        //(without prompts) is returned
        instance.sendCommand (command);
        // close only after all commands are sent


    }
}