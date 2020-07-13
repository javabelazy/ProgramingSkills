/**
 * String str = "Consumerfed Kozhikode Regional Office"
 * byte array : [-61, -106, -107, -94, -92, -108, -123, -103, -122, -123, -124, 64, -46, -106, -87, -120, -119, -110, -106, -124, -123, 64, -39, -123, -121, -119, -106, -107, -127, -109, 64, -42, -122, -122, -119, -125, -123]

 */
package com.cfed.datastructures;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/**
 * @author Apple
 *
 */
public class ByteToString {

	public String convertByteToString(byte[] data, int offset, int length, String characterEncoding) throws CharacterCodingException {
		ByteBuffer buffer = ByteBuffer.wrap(data, offset, length);
		Charset charset = Charset.forName(characterEncoding);
		CharsetDecoder decoder = charset.newDecoder();
		CharBuffer cBuffer = null;
			cBuffer = decoder.decode(buffer);
		return cBuffer.toString();
	}

	/**
	 * @param args
	 * @throws UnsupportedEncodingException
	 * @throws CharacterCodingException     386304
	 */
	public static void main(String[] args) throws UnsupportedEncodingException, CharacterCodingException {
		long start = System.currentTimeMillis();
		byte[] input = { -61, -106, -107, -94, -92, -108, -123, -103, -122, -123, -124, 64, -46, -106, -87, -120, -119,
				-110, -106, -124, -123, 64, -39, -123, -121, -119, -106, -107, -127, -109, 64, -42, -122, -122, -119,
				-125, -123 };
//		String output = new String(input, 3, 5, "CP1047");
//		System.out.println(output);
//		System.out.println(System.currentTimeMillis()-start);
		start = System.currentTimeMillis();
		Charset charset = Charset.forName("CP1047");
		CharsetDecoder decoder = charset.newDecoder();
		ByteBuffer a = ByteBuffer.wrap(input, 3, 5);
		CharBuffer cBuffer = decoder.decode(a);
		System.out.println(cBuffer.toString());
		System.out.println(System.currentTimeMillis() - start);
		;
		Runtime runtime = Runtime.getRuntime();
		runtime.gc();
		long memory = runtime.totalMemory() - runtime.freeMemory();
		System.out.println("Used memory is bytes: " + memory);

	}

}
