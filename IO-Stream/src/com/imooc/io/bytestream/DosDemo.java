package com.imooc.io.bytestream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DosDemo {
	public static void main(String[] args) throws IOException {
		String file = "demo/dos.dat";
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
		dos.writeInt(10);
		dos.writeInt(-10);
		dos.writeLong(10L);
		dos.writeDouble(10.5);
		//采用utf8编码写出
		dos.writeUTF("中国");
		dos.close();
		IOUtil.printHex(file);
	}
}
