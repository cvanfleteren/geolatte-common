/*
 * This file is part of the GeoLatte project.
 *
 *     GeoLatte is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     GeoLatte is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with GeoLatte.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright (C) 2010 - 2010 and Ownership of code is shared by:
 * Qmino bvba - Romeinsestraat 18 - 3001 Heverlee  (http://www.qmino.com)
 * Geovise bvba - Generaal Eisenhowerlei 9 - 2140 Antwerpen (http://www.geovise.com)
 */

package org.geolatte.common.transformer;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * <p>
 * <i>Creation-Date</i>: 19-Mar-2010<br>
 * <i>Creation-Time</i>:  16:19:56<br>
 * </p>
 *
 * @author Bert Vanhooff
 * @author <a href="http://www.qmino.com">Qmino bvba</a>
 * @since SDK1.5
 */
public class SimpleTransformationSinkTest {

    /**
     * Tests whether the sink just copies its input to the output retrieved via getCollectedOutput().
     * @throws Exception
     */
    @Test
    public void testGetOutput() {

        ArrayList<String> input = new ArrayList<String>(Arrays.asList(new String[]{"Scarlett", "Natalie", "Rachel", "Cameron"}));

        SimpleTransformerSink<String> sink = new SimpleTransformerSink<String>();
        sink.setInput(input);

        sink.start(); // start so the sinks collects data

        int step = 0;
        for (String element : sink.getCollectedOutput()) {

            Assert.assertEquals(input.get(step), element);
            step++;
        }
    }
}
