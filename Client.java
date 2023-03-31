
import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost", 50000);
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            DataOutputStream out = new DataOutputStream(s.getOutputStream());

            out.write(("HELO" + "\n").getBytes());

            String str=in.readLine();

            String username = System.getProperty("user.name");
            out.write(("AUTH " + username + "\n").getBytes());

            str=in.readLine();
            System.out.println(str);

            out.write(("REDY\n").getBytes());

            str=in.readLine();
            System.out.println(str);

            Socket s = new Socket("127.0.0.1",50000);
            DataOutputStream

            System.out.println("SENT : REDY");
            dout.write(("REDY\n").getBytes());
            dout.flush();
            str = din.readLine();
            System.out.println("RCVD: " + str);
            String[] jobInfo = str.split(" ");
            jobID = Integer.parseInt(jobInfo[2]);
            
            sendMsg("K");
            for (int i = 0; i< serverNumber; i++){
            	String[] serverInfo = str.split(" ");
            	if(Integer.parseInt(serverInfo[4] > serverCore){

	

            out.write(("QUIT\n").getBytes());

            str=in.readLine();

            in.close();
            out.close();
            s.close();

        } catch (IOException e) { e.printStackTrace(); System.exit(1); }
    }
}
