package com.java14.jep370;

/*import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryHandles;
import jdk.incubator.foreign.MemorySegment;

import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;*/

// --add-modules jdk.incubator.foreign
public class FroignMemory {

    /*public static void main(String[] args) {

        VarHandle intHandle = MemoryHandles.varHandle(int.class, ByteOrder.nativeOrder());

        try (MemorySegment segment = MemorySegment.allocateNative(1024)) {

            MemoryAddress base = segment.baseAddress();

            System.out.println(base);                 // print memory address

            intHandle.set(base, 999);                 // set value 999 into the foreign memory

            System.out.println(intHandle.get(base));  // get the value from foreign memory

        }

    }*/

}