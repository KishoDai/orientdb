/*
 *
 *  *  Copyright 2010-2016 OrientDB LTD (http://orientdb.com)
 *  *
 *  *  Licensed under the Apache License, Version 2.0 (the "License");
 *  *  you may not use this file except in compliance with the License.
 *  *  You may obtain a copy of the License at
 *  *
 *  *       http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *  Unless required by applicable law or agreed to in writing, software
 *  *  distributed under the License is distributed on an "AS IS" BASIS,
 *  *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  See the License for the specific language governing permissions and
 *  *  limitations under the License.
 *  *
 *  * For more information: http://orientdb.com
 *
 */

package com.orientechnologies.orient.core.serialization.serializer.record.binary;

import com.orientechnologies.orient.core.db.record.ridbag.ORidBag;
import com.orientechnologies.orient.core.metadata.schema.OType;

/**
 * @author Sergey Sitnikov
 */
public class ORecordSerializerBinaryV1 extends ORecordSerializerBinaryV0 {

  @Override
  public int serializeValue(BytesContainer bytes, Object value, OType type, OType linkedType) {
    if (type == OType.LINKBAG)
      return ((ORidBag) value).toStream(bytes, ORidBag.Encoding.Compact);

    return super.serializeValue(bytes, value, type, linkedType);
  }

}
