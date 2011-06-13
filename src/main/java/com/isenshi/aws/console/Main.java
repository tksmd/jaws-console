package com.isenshi.aws.console;

import asg.cliche.ShellFactory;

public class Main {

	public static void main(String[] args) throws Exception {
		ShellFactory.createConsoleShell("jaws", "", new Dispatcher())
				.commandLoop();
	}

}
