package com.openddal.server.mysql.proto.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.openddal.server.mysql.proto.HandshakeResponse;

public class HandshakeResponseTest {

    @Test
    public void test_1() {
        byte[] packet = new byte[] {
            (byte)0x2f, (byte)0x00, (byte)0x00, (byte)0x01, (byte)0x0d, (byte)0xa6, (byte)0x03, (byte)0x00,
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x01, (byte)0x08, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x72, (byte)0x6f, (byte)0x6f, (byte)0x74,
            (byte)0x00, (byte)0x00, (byte)0x73, (byte)0x79, (byte)0x73, (byte)0x62, (byte)0x65, (byte)0x6e,
            (byte)0x63, (byte)0x68, (byte)0x00
        };
        assertArrayEquals(packet, HandshakeResponse.loadFromPacket(packet).toPacket());
    }

    @Test
    public void test_5_5_8() {
        // https://dev.mysql.com/doc/internals/en/connection-phase-packets.html#packet-Protocol::HandshakeResponse
        byte[] packet = new byte[] {
            (byte)0x54, (byte)0x00, (byte)0x00, (byte)0x01, (byte)0x8d, (byte)0xa6, (byte)0x0f, (byte)0x00,
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x01, (byte)0x08, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x70, (byte)0x61, (byte)0x6d, (byte)0x00,
            (byte)0x14, (byte)0xab, (byte)0x09, (byte)0xee, (byte)0xf6, (byte)0xbc, (byte)0xb1, (byte)0x32,
            (byte)0x3e, (byte)0x61, (byte)0x14, (byte)0x38, (byte)0x65, (byte)0xc0, (byte)0x99, (byte)0x1d,
            (byte)0x95, (byte)0x7d, (byte)0x75, (byte)0xd4, (byte)0x47, (byte)0x74, (byte)0x65, (byte)0x73,
            (byte)0x74, (byte)0x00, (byte)0x6d, (byte)0x79, (byte)0x73, (byte)0x71, (byte)0x6c, (byte)0x5f,
            (byte)0x6e, (byte)0x61, (byte)0x74, (byte)0x69, (byte)0x76, (byte)0x65, (byte)0x5f, (byte)0x70,
            (byte)0x61, (byte)0x73, (byte)0x73, (byte)0x77, (byte)0x6f, (byte)0x72, (byte)0x64, (byte)0x00,
        };
        
        assertArrayEquals(packet, HandshakeResponse.loadFromPacket(packet).toPacket());
    }

    @Test
    public void test_5_6_6() {
        // https://dev.mysql.com/doc/internals/en/connection-phase-packets.html#packet-Protocol::HandshakeResponse
        byte[] packet = new byte[] {
            (byte)0xb2, (byte)0x00, (byte)0x00, (byte)0x01, (byte)0x85, (byte)0xa2, (byte)0x1e, (byte)0x00,
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x40, (byte)0x08, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x72, (byte)0x6f, (byte)0x6f, (byte)0x74,
            (byte)0x00, (byte)0x14, (byte)0x22, (byte)0x50, (byte)0x79, (byte)0xa2, (byte)0x12, (byte)0xd4,
            (byte)0xe8, (byte)0x82, (byte)0xe5, (byte)0xb3, (byte)0xf4, (byte)0x1a, (byte)0x97, (byte)0x75,
            (byte)0x6b, (byte)0xc8, (byte)0xbe, (byte)0xdb, (byte)0x9f, (byte)0x80, (byte)0x6d, (byte)0x79,
            (byte)0x73, (byte)0x71, (byte)0x6c, (byte)0x5f, (byte)0x6e, (byte)0x61, (byte)0x74, (byte)0x69,
            (byte)0x76, (byte)0x65, (byte)0x5f, (byte)0x70, (byte)0x61, (byte)0x73, (byte)0x73, (byte)0x77,
            (byte)0x6f, (byte)0x72, (byte)0x64, (byte)0x00, (byte)0x61, (byte)0x03, (byte)0x5f, (byte)0x6f,
            (byte)0x73, (byte)0x09, (byte)0x64, (byte)0x65, (byte)0x62, (byte)0x69, (byte)0x61, (byte)0x6e,
            (byte)0x36, (byte)0x2e, (byte)0x30, (byte)0x0c, (byte)0x5f, (byte)0x63, (byte)0x6c, (byte)0x69,
            (byte)0x65, (byte)0x6e, (byte)0x74, (byte)0x5f, (byte)0x6e, (byte)0x61, (byte)0x6d, (byte)0x65,
            (byte)0x08, (byte)0x6c, (byte)0x69, (byte)0x62, (byte)0x6d, (byte)0x79, (byte)0x73, (byte)0x71,
            (byte)0x6c, (byte)0x04, (byte)0x5f, (byte)0x70, (byte)0x69, (byte)0x64, (byte)0x05, (byte)0x32,
            (byte)0x32, (byte)0x33, (byte)0x34, (byte)0x34, (byte)0x0f, (byte)0x5f, (byte)0x63, (byte)0x6c,
            (byte)0x69, (byte)0x65, (byte)0x6e, (byte)0x74, (byte)0x5f, (byte)0x76, (byte)0x65, (byte)0x72,
            (byte)0x73, (byte)0x69, (byte)0x6f, (byte)0x6e, (byte)0x08, (byte)0x35, (byte)0x2e, (byte)0x36,
            (byte)0x2e, (byte)0x36, (byte)0x2d, (byte)0x6d, (byte)0x39, (byte)0x09, (byte)0x5f, (byte)0x70,
            (byte)0x6c, (byte)0x61, (byte)0x74, (byte)0x66, (byte)0x6f, (byte)0x72, (byte)0x6d, (byte)0x06,
            (byte)0x78, (byte)0x38, (byte)0x36, (byte)0x5f, (byte)0x36, (byte)0x34, (byte)0x03, (byte)0x66,
            (byte)0x6f, (byte)0x6f, (byte)0x03, (byte)0x62, (byte)0x61, (byte)0x72
        };
        assertArrayEquals(packet, HandshakeResponse.loadFromPacket(packet).toPacket());
    }

    @Test
    public void test_3_2_0() {
        // https://dev.mysql.com/doc/internals/en/connection-phase-packets.html#packet-Protocol::HandshakeResponse
        byte[] packet = new byte[] {
            (byte)0x11, (byte)0x00, (byte)0x00, (byte)0x01, (byte)0x85, (byte)0x24, (byte)0x00, (byte)0x00,
            (byte)0x00, (byte)0x6f, (byte)0x6c, (byte)0x64, (byte)0x00, (byte)0x47, (byte)0x44, (byte)0x53,
            (byte)0x43, (byte)0x51, (byte)0x59, (byte)0x52, (byte)0x5f
        };
        assertArrayEquals(packet, HandshakeResponse.loadFromPacket(packet).toPacket());
    }
}
