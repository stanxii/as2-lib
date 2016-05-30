/**
 * The FreeBSD Copyright
 * Copyright 1994-2008 The FreeBSD Project. All rights reserved.
 * Copyright (C) 2013-2016 Philip Helger philip[at]helger[dot]com
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 *    1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 *    2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE FREEBSD PROJECT ``AS IS'' AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE FREEBSD PROJECT OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * The views and conclusions contained in the software and documentation
 * are those of the authors and should not be interpreted as representing
 * official policies, either expressed or implied, of the FreeBSD Project.
 */
package com.helger.as2lib.util;

import java.util.Enumeration;
import java.util.Map;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.collection.ext.ICommonsList;
import com.helger.commons.collection.ext.ICommonsOrderedMap;
import com.helger.commons.collection.ext.ICommonsOrderedSet;
import com.helger.commons.lang.ICloneable;

public interface IStringMap extends ICloneable <IStringMap>, Iterable <Map.Entry <String, String>>
{
  boolean containsAttribute (@Nullable String sName);

  @Nonnull
  @ReturnsMutableCopy
  ICommonsOrderedMap <String, String> getAllAttributes ();

  @Nullable
  String getAttributeAsString (@Nullable String sName);

  @Nullable
  String getAttributeAsString (@Nullable String sName, @Nullable String sDefault);

  int getAttributeAsInt (@Nullable String sName);

  int getAttributeAsInt (@Nullable String sName, int nDefault);

  long getAttributeAsLong (@Nullable String sName);

  long getAttributeAsLong (@Nullable String sName, long nDefault);

  double getAttributeAsDouble (@Nullable String sName);

  double getAttributeAsDouble (@Nullable String sName, double dDefault);

  boolean getAttributeAsBoolean (@Nullable String sName);

  boolean getAttributeAsBoolean (@Nullable String sName, boolean bDefault);

  @Nonnull
  @ReturnsMutableCopy
  Enumeration <String> getAttributeNames ();

  @Nonnull
  @ReturnsMutableCopy
  ICommonsOrderedSet <String> getAllAttributeNames ();

  @Nonnull
  @ReturnsMutableCopy
  ICommonsList <String> getAllAttributeValues ();

  @Nonnegative
  int getAttributeCount ();

  boolean containsNoAttribute ();
}
