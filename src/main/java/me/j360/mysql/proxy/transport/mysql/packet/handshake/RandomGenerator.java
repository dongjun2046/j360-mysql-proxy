/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package me.j360.mysql.proxy.transport.mysql.packet.handshake;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Random;

/**
 * Random generator.
 *
 * @author zhangliang
 */
@NoArgsConstructor(access = AccessLevel.NONE)
public final class RandomGenerator {
    
    @Getter
    private static RandomGenerator instance = new RandomGenerator();
    
    private static final byte[] SEED = {
        'a', 'b', 'e', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', };
    
    private Random random = new Random();
    
    /**
     * Generate random bytes.
     * 
     * @param length length for generated bytes.
     * @return generated bytes
     */
    public byte[] generateRandomBytes(final int length) {
        byte[] result = new byte[length];
        for (int i = 0; i < length; i++) {
            result[i] = SEED[random.nextInt(SEED.length)];
        }
        return result;
    }
}
