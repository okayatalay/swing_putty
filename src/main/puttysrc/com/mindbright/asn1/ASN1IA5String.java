/******************************************************************************
 *
 * Copyright (c) 1999-2011 Cryptzone Group AB. All Rights Reserved.
 * 
 * This file contains Original Code and/or Modifications of Original Code as
 * defined in and that are subject to the MindTerm Public Source License,
 * Version 2.0, (the 'License'). You may not use this file except in compliance
 * with the License.
 * 
 * You should have received a copy of the MindTerm Public Source License
 * along with this software; see the file LICENSE.  If not, write to
 * Cryptzone Group AB, Drakegatan 7, SE-41250 Goteborg, SWEDEN
 *
 *****************************************************************************/

package com.mindbright.asn1;

public class ASN1IA5String extends ASN1CharString {

    public ASN1IA5String() {
        super(ASN1.TAG_IA5STRING);
    }

    // !!! TODO, should have check here, can't contain non-7-bit-ASCII !!!
    // How do we want to do this ???

    public void setValue(String string) {
        byte[] tmp = string.getBytes();
        setRaw(tmp);
    }

    public String getValue() {
        return new String(value);
    }

    public String toString() {
        return getValue();
    }
}
