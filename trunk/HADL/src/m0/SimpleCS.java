package m0;

import m1.*;

public class SimpleCS {

	public static void main(String[] args) {
		//New System
		m1.System system = new m1.System("system");
		
		//New Clients with their PortSendRequest
		PortSendRequest send1 = new PortSendRequest("send1");
		Client client1 = new Client("client1", send1);
		system.addClient(client1);
		PortSendRequest send2 = new PortSendRequest("send2");
		Client client2 = new Client("client2", send2);
		system.addClient(client2);
		
		//New Server with his two PortSendRequest
		PortReceiveRequest receive1 = new PortReceiveRequest("receive1");
		PortReceiveRequest receive2 = new PortReceiveRequest("receive2");
		Server server1 = new Server("server1", receive1);
		server1.addPortReceiveRequest(receive2);
		system.addServer(server1);
		
		//New RPC with his two Roles
		Caller caller1 = new Caller("caller1");
		Called called1 = new Called("called1");
		RPC rpc1 = new RPC("rpc1", caller1, called1);
		system.addRPC(rpc1);
		
		//Another RPC with his two Roles
		Caller caller2 = new Caller("caller2");
		Called called2 = new Called("called2");
		RPC rpc2 = new RPC("rpc2", caller2, called2);
		system.addRPC(rpc2);
		
		//Attachments for the first RPC
		AttachmentIn attachmentIn1 = new AttachmentIn("attachmentIn1", send1, caller1);
		system.addAttachmentIn(attachmentIn1);
		AttachmentIn attachmentIn2 = new AttachmentIn("attachmentIn2", send2, caller2);
		system.addAttachmentIn(attachmentIn2);
		
		//Attachments for the second RPC
		AttachmentOut attachmentOut1 = new AttachmentOut("attachmentOut1", called1, receive1);
		system.addAttachmentOut(attachmentOut1);
		AttachmentOut attachmentOut2 = new AttachmentOut("attachmentOut2", called2, receive2);
		system.addAttachmentOut(attachmentOut2);
		
		//Display
		java.lang.System.out.println(system);
	}

}
