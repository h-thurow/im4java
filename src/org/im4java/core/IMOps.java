/**************************************************************************
/* This class adds all the IM methods to an Operation.
/*
/* Copyright (c) 2009 by Bernhard Bablok (mail@bablokb.de)
/*
/* This program is free software; you can redistribute it and/or modify
/* it under the terms of the GNU Library General Public License as published
/* by  the Free Software Foundation; either version 2 of the License or
/* (at your option) any later version.
/*
/* This program is distributed in the hope that it will be useful, but
/* WITHOUT ANY WARRANTY; without even the implied warranty of
/* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
/* GNU Library General Public License for more details.
/*
/* You should have received a copy of the GNU Library General Public License
/* along with this program; see the file COPYING.LIB.  If not, write to
/* the Free Software Foundation Inc., 59 Temple Place - Suite 330,
/* Boston, MA  02111-1307 USA
/**************************************************************************/

package org.im4java.core;

/**
   This class adds all the IM methods to an Operation.

   @version $Revision: 1.11 $
   @author  $Author: bablokb $
*/

public class IMOps extends Operation {

  //////////////////////////////////////////////////////////////////////////////

  /**
     Constructor.
  */

  protected IMOps() {
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -adaptive-blur (see ImageMagick-Documentation for details).
  */

  public IMOps adaptiveBlur() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-adaptive-blur");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -adaptive-blur (see ImageMagick-Documentation for details).
  */

  public IMOps adaptiveBlur(Double radius) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-adaptive-blur");

    if (radius != null) {
      buf.append(radius.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -adaptive-blur (see ImageMagick-Documentation for details).
  */

  public IMOps adaptiveBlur(Double radius, Double sigma) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-adaptive-blur");

    if (radius != null) {
      buf.append(radius.toString());
    }
    buf.append("x");
    if (sigma != null) {
      buf.append(sigma.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -adaptive-resize (see ImageMagick-Documentation for details).
  */

  public IMOps adaptiveResize() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-adaptive-resize");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -adaptive-resize (see ImageMagick-Documentation for details).
  */

  public IMOps adaptiveResize(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-adaptive-resize");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -adaptive-resize (see ImageMagick-Documentation for details).
  */

  public IMOps adaptiveResize(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-adaptive-resize");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -adaptive-resize (see ImageMagick-Documentation for details).
  */

  public IMOps adaptiveResize(Integer width, Integer height, Character special) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-adaptive-resize");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (special != null) {
      buf.append(special.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -adaptive-sharpen (see ImageMagick-Documentation for details).
  */

  public IMOps adaptiveSharpen() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-adaptive-sharpen");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -adaptive-sharpen (see ImageMagick-Documentation for details).
  */

  public IMOps adaptiveSharpen(Double radius) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-adaptive-sharpen");

    if (radius != null) {
      buf.append(radius.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -adaptive-sharpen (see ImageMagick-Documentation for details).
  */

  public IMOps adaptiveSharpen(Double radius, Double sigma) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-adaptive-sharpen");

    if (radius != null) {
      buf.append(radius.toString());
    }
    buf.append("x");
    if (sigma != null) {
      buf.append(sigma.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -adjoin (see ImageMagick-Documentation for details).
  */

  public IMOps adjoin() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-adjoin");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +adjoin (see ImageMagick-Documentation for details).
  */

  public IMOps p_adjoin() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+adjoin");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -affine (see ImageMagick-Documentation for details).
  */

  public IMOps affine() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-affine");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -affine (see ImageMagick-Documentation for details).
  */

  public IMOps affine(Double sx) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-affine");

    if (sx != null) {
      buf.append(sx.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -affine (see ImageMagick-Documentation for details).
  */

  public IMOps affine(Double sx, Double rx) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-affine");

    if (sx != null) {
      buf.append(sx.toString());
    }
    buf.append(",");
    if (rx != null) {
      buf.append(rx.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -affine (see ImageMagick-Documentation for details).
  */

  public IMOps affine(Double sx, Double rx, Double ry) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-affine");

    if (sx != null) {
      buf.append(sx.toString());
    }
    buf.append(",");
    if (rx != null) {
      buf.append(rx.toString());
    }
    buf.append(",");
    if (ry != null) {
      buf.append(ry.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -affine (see ImageMagick-Documentation for details).
  */

  public IMOps affine(Double sx, Double rx, Double ry, Double sy) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-affine");

    if (sx != null) {
      buf.append(sx.toString());
    }
    buf.append(",");
    if (rx != null) {
      buf.append(rx.toString());
    }
    buf.append(",");
    if (ry != null) {
      buf.append(ry.toString());
    }
    buf.append(",");
    if (sy != null) {
      buf.append(sy.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -affine (see ImageMagick-Documentation for details).
  */

  public IMOps affine(Double sx, Double rx, Double ry, Double sy, Double tx) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-affine");

    if (sx != null) {
      buf.append(sx.toString());
    }
    buf.append(",");
    if (rx != null) {
      buf.append(rx.toString());
    }
    buf.append(",");
    if (ry != null) {
      buf.append(ry.toString());
    }
    buf.append(",");
    if (sy != null) {
      buf.append(sy.toString());
    }
    buf.append(",");
    if (tx != null) {
      buf.append(tx.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -affine (see ImageMagick-Documentation for details).
  */

  public IMOps affine(Double sx, Double rx, Double ry, Double sy, Double tx, Double ty) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-affine");

    if (sx != null) {
      buf.append(sx.toString());
    }
    buf.append(",");
    if (rx != null) {
      buf.append(rx.toString());
    }
    buf.append(",");
    if (ry != null) {
      buf.append(ry.toString());
    }
    buf.append(",");
    if (sy != null) {
      buf.append(sy.toString());
    }
    buf.append(",");
    if (tx != null) {
      buf.append(tx.toString());
    }
    buf.append(",");
    if (ty != null) {
      buf.append(ty.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -alpha (see ImageMagick-Documentation for details).
  */

  public IMOps alpha() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-alpha");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -alpha (see ImageMagick-Documentation for details).
  */

  public IMOps alpha(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-alpha");

    if (type != null) {
      buf.append(type.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -annotate (see ImageMagick-Documentation for details).
  */

  public IMOps annotate() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-annotate");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -annotate (see ImageMagick-Documentation for details).
  */

  public IMOps annotate(Integer xr) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-annotate");

    if (xr != null) {
      buf.append(xr.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -annotate (see ImageMagick-Documentation for details).
  */

  public IMOps annotate(Integer xr, Integer yr) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-annotate");

    if (xr != null) {
      buf.append(xr.toString());
    }
    buf.append("x");
    if (yr != null) {
      buf.append(yr.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -annotate (see ImageMagick-Documentation for details).
  */

  public IMOps annotate(Integer xr, Integer yr, Integer x) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-annotate");

    if (xr != null) {
      buf.append(xr.toString());
    }
    buf.append("x");
    if (yr != null) {
      buf.append(yr.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -annotate (see ImageMagick-Documentation for details).
  */

  public IMOps annotate(Integer xr, Integer yr, Integer x, Integer y) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-annotate");

    if (xr != null) {
      buf.append(xr.toString());
    }
    buf.append("x");
    if (yr != null) {
      buf.append(yr.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -annotate (see ImageMagick-Documentation for details).
  */

  public IMOps annotate(Integer xr, Integer yr, Integer x, Integer y, String text) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-annotate");

    if (xr != null) {
      buf.append(xr.toString());
    }
    buf.append("x");
    if (yr != null) {
      buf.append(yr.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
    }
    iCmdArgs.add(buf.toString());
    buf.setLength(0);
    if (text != null) {
      buf.append(text.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -antialias (see ImageMagick-Documentation for details).
  */

  public IMOps antialias() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-antialias");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +antialias (see ImageMagick-Documentation for details).
  */

  public IMOps p_antialias() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+antialias");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -append (see ImageMagick-Documentation for details).
  */

  public IMOps append() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-append");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +append (see ImageMagick-Documentation for details).
  */

  public IMOps p_append() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+append");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -attenuate (see ImageMagick-Documentation for details).
  */

  public IMOps attenuate() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-attenuate");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -attenuate (see ImageMagick-Documentation for details).
  */

  public IMOps attenuate(Double value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-attenuate");

    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -authenticate (see ImageMagick-Documentation for details).
  */

  public IMOps authenticate() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-authenticate");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -authenticate (see ImageMagick-Documentation for details).
  */

  public IMOps authenticate(String password) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-authenticate");

    if (password != null) {
      buf.append(password.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -auto-orient (see ImageMagick-Documentation for details).
  */

  public IMOps autoOrient() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-auto-orient");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -average (see ImageMagick-Documentation for details).
  */

  public IMOps average() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-average");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -backdrop (see ImageMagick-Documentation for details).
  */

  public IMOps backdrop() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-backdrop");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -backdrop (see ImageMagick-Documentation for details).
  */

  public IMOps backdrop(String color) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-backdrop");

    if (color != null) {
      buf.append(color.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -background (see ImageMagick-Documentation for details).
  */

  public IMOps background() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-background");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -background (see ImageMagick-Documentation for details).
  */

  public IMOps background(String color) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-background");

    if (color != null) {
      buf.append(color.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -bench (see ImageMagick-Documentation for details).
  */

  public IMOps bench() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-bench");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -bench (see ImageMagick-Documentation for details).
  */

  public IMOps bench(Integer iterations) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-bench");

    if (iterations != null) {
      buf.append(iterations.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -blend (see ImageMagick-Documentation for details).
  */

  public IMOps blend() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-blend");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -blend (see ImageMagick-Documentation for details).
  */

  public IMOps blend(Integer srcPercent) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-blend");

    if (srcPercent != null) {
      buf.append(srcPercent.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -blend (see ImageMagick-Documentation for details).
  */

  public IMOps blend(Integer srcPercent, Integer dstPercent) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-blend");

    if (srcPercent != null) {
      buf.append(srcPercent.toString());
    }
    buf.append("x");
    if (dstPercent != null) {
      buf.append(dstPercent.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -bias (see ImageMagick-Documentation for details).
  */

  public IMOps bias() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-bias");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -bias (see ImageMagick-Documentation for details).
  */

  public IMOps bias(Integer value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-bias");

    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -bias (see ImageMagick-Documentation for details).
  */

  public IMOps bias(Integer value, Boolean percent) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-bias");

    if (value != null) {
      buf.append(value.toString());
    }
    if (percent != null) {
      if (percent.booleanValue())
        buf.append("%");
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -black-point-compensation (see ImageMagick-Documentation for details).
  */

  public IMOps blackPointCompensation() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-black-point-compensation");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -black-threshold (see ImageMagick-Documentation for details).
  */

  public IMOps blackThreshold() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-black-threshold");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -black-threshold (see ImageMagick-Documentation for details).
  */

  public IMOps blackThreshold(Double threshold) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-black-threshold");

    if (threshold != null) {
      buf.append(threshold.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -blue-primary (see ImageMagick-Documentation for details).
  */

  public IMOps bluePrimary() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-blue-primary");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -blue-primary (see ImageMagick-Documentation for details).
  */

  public IMOps bluePrimary(Double x) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-blue-primary");

    if (x != null) {
      buf.append(x.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -blue-primary (see ImageMagick-Documentation for details).
  */

  public IMOps bluePrimary(Double x, Double y) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-blue-primary");

    if (x != null) {
      buf.append(x.toString());
    }
    buf.append(",");
    if (y != null) {
      buf.append(y.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -blur (see ImageMagick-Documentation for details).
  */

  public IMOps blur() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-blur");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -blur (see ImageMagick-Documentation for details).
  */

  public IMOps blur(Double radius) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-blur");

    if (radius != null) {
      buf.append(radius.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -blur (see ImageMagick-Documentation for details).
  */

  public IMOps blur(Double radius, Double sigma) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-blur");

    if (radius != null) {
      buf.append(radius.toString());
    }
    buf.append("x");
    if (sigma != null) {
      buf.append(sigma.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -bordercolor (see ImageMagick-Documentation for details).
  */

  public IMOps bordercolor() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-bordercolor");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -bordercolor (see ImageMagick-Documentation for details).
  */

  public IMOps bordercolor(String color) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-bordercolor");

    if (color != null) {
      buf.append(color.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -border (see ImageMagick-Documentation for details).
  */

  public IMOps border(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-border");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -border (see ImageMagick-Documentation for details).
  */

  public IMOps border(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-border");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -borderwidth (see ImageMagick-Documentation for details).
  */

  public IMOps borderwidth() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-borderwidth");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -borderwidth (see ImageMagick-Documentation for details).
  */

  public IMOps borderwidth(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-borderwidth");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -borderwidth (see ImageMagick-Documentation for details).
  */

  public IMOps borderwidth(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-borderwidth");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -borderwidth (see ImageMagick-Documentation for details).
  */

  public IMOps borderwidth(Integer width, Integer height, Integer xOffset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-borderwidth");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (xOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (xOffset != null) {
      buf.append(xOffset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -borderwidth (see ImageMagick-Documentation for details).
  */

  public IMOps borderwidth(Integer width, Integer height, Integer xOffset, Integer yOffset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-borderwidth");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (xOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (xOffset != null) {
      buf.append(xOffset.toString());
    }
    oper="+";
    if (yOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (yOffset != null) {
      buf.append(yOffset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -cache (see ImageMagick-Documentation for details).
  */

  public IMOps cache() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-cache");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -cache (see ImageMagick-Documentation for details).
  */

  public IMOps cache(Double threshold) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-cache");

    if (threshold != null) {
      buf.append(threshold.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -caption (see ImageMagick-Documentation for details).
  */

  public IMOps caption() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-caption");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -caption (see ImageMagick-Documentation for details).
  */

  public IMOps caption(String text) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-caption");

    if (text != null) {
      buf.append(text.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +channel (see ImageMagick-Documentation for details).
  */

  public IMOps p_channel() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+channel");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -channel (see ImageMagick-Documentation for details).
  */

  public IMOps channel() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-channel");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -channel (see ImageMagick-Documentation for details).
  */

  public IMOps channel(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-channel");

    if (type != null) {
      buf.append(type.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -charcoal (see ImageMagick-Documentation for details).
  */

  public IMOps charcoal() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-charcoal");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -charcoal (see ImageMagick-Documentation for details).
  */

  public IMOps charcoal(Integer factor) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-charcoal");

    if (factor != null) {
      buf.append(factor.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -chop (see ImageMagick-Documentation for details).
  */

  public IMOps chop() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-chop");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -chop (see ImageMagick-Documentation for details).
  */

  public IMOps chop(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-chop");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -chop (see ImageMagick-Documentation for details).
  */

  public IMOps chop(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-chop");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -chop (see ImageMagick-Documentation for details).
  */

  public IMOps chop(Integer width, Integer height, Integer x) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-chop");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -chop (see ImageMagick-Documentation for details).
  */

  public IMOps chop(Integer width, Integer height, Integer x, Integer y) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-chop");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -chop (see ImageMagick-Documentation for details).
  */

  public IMOps chop(Integer width, Integer height, Integer x, Integer y, Boolean percent) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-chop");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
    }
    if (percent != null) {
      if (percent.booleanValue())
        buf.append("%");
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -clip (see ImageMagick-Documentation for details).
  */

  public IMOps clip() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-clip");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -clip-mask (see ImageMagick-Documentation for details).
  */

  public IMOps clipMask() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-clip-mask");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -clip-path (see ImageMagick-Documentation for details).
  */

  public IMOps clipPath() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-clip-path");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -clip-path (see ImageMagick-Documentation for details).
  */

  public IMOps clipPath(Integer id) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-clip-path");

    if (id != null) {
      buf.append(id.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +clone (see ImageMagick-Documentation for details).
  */

  public IMOps p_clone() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+clone");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -clone (see ImageMagick-Documentation for details).
  */

  public IMOps clone() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-clone");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -clone (see ImageMagick-Documentation for details).
  */

  public IMOps clone(Integer index1) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-clone");

    if (index1 != null) {
      buf.append(index1.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -clone (see ImageMagick-Documentation for details).
  */

  public IMOps clone(Integer index1, Integer index2) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-clone");

    if (index1 != null) {
      buf.append(index1.toString());
    }
    buf.append(",");
    if (index2 != null) {
      buf.append(index2.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -clone (see ImageMagick-Documentation for details).
  */

  public IMOps clone(Integer index1, Integer index2, Integer index3) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-clone");

    if (index1 != null) {
      buf.append(index1.toString());
    }
    buf.append(",");
    if (index2 != null) {
      buf.append(index2.toString());
    }
    buf.append(",");
    if (index3 != null) {
      buf.append(index3.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -clone (see ImageMagick-Documentation for details).
  */

  public IMOps clone(String indexes) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-clone");

    if (indexes != null) {
      buf.append(indexes.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -clut (see ImageMagick-Documentation for details).
  */

  public IMOps clut() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-clut");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -coalesce (see ImageMagick-Documentation for details).
  */

  public IMOps coalesce() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-coalesce");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -colorize (see ImageMagick-Documentation for details).
  */

  public IMOps colorize() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-colorize");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -colorize (see ImageMagick-Documentation for details).
  */

  public IMOps colorize(Integer red) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-colorize");

    if (red != null) {
      buf.append(red.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -colorize (see ImageMagick-Documentation for details).
  */

  public IMOps colorize(Integer red, Integer blue) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-colorize");

    if (red != null) {
      buf.append(red.toString());
    }
    buf.append(",");
    if (blue != null) {
      buf.append(blue.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -colorize (see ImageMagick-Documentation for details).
  */

  public IMOps colorize(Integer red, Integer blue, Integer green) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-colorize");

    if (red != null) {
      buf.append(red.toString());
    }
    buf.append(",");
    if (blue != null) {
      buf.append(blue.toString());
    }
    buf.append(",");
    if (green != null) {
      buf.append(green.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -colormap (see ImageMagick-Documentation for details).
  */

  public IMOps colormap() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-colormap");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -colormap (see ImageMagick-Documentation for details).
  */

  public IMOps colormap(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-colormap");

    if (type != null) {
      buf.append(type.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -colors (see ImageMagick-Documentation for details).
  */

  public IMOps colors() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-colors");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -colors (see ImageMagick-Documentation for details).
  */

  public IMOps colors(Integer value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-colors");

    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -colorspace (see ImageMagick-Documentation for details).
  */

  public IMOps colorspace() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-colorspace");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -colorspace (see ImageMagick-Documentation for details).
  */

  public IMOps colorspace(String value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-colorspace");

    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -combine (see ImageMagick-Documentation for details).
  */

  public IMOps combine() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-combine");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -comment (see ImageMagick-Documentation for details).
  */

  public IMOps comment() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-comment");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -comment (see ImageMagick-Documentation for details).
  */

  public IMOps comment(String text) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-comment");

    if (text != null) {
      buf.append(text.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -compose (see ImageMagick-Documentation for details).
  */

  public IMOps compose() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-compose");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -compose (see ImageMagick-Documentation for details).
  */

  public IMOps compose(String operator) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-compose");

    if (operator != null) {
      buf.append(operator.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -composite (see ImageMagick-Documentation for details).
  */

  public IMOps composite() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-composite");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +compress (see ImageMagick-Documentation for details).
  */

  public IMOps p_compress() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+compress");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -compress (see ImageMagick-Documentation for details).
  */

  public IMOps compress() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-compress");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -compress (see ImageMagick-Documentation for details).
  */

  public IMOps compress(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-compress");

    if (type != null) {
      buf.append(type.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -contrast (see ImageMagick-Documentation for details).
  */

  public IMOps contrast() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-contrast");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +contrast (see ImageMagick-Documentation for details).
  */

  public IMOps p_contrast() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+contrast");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -contrast-stretch (see ImageMagick-Documentation for details).
  */

  public IMOps contrastStretch() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-contrast-stretch");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -contrast-stretch (see ImageMagick-Documentation for details).
  */

  public IMOps contrastStretch(Integer blackPoint) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-contrast-stretch");

    if (blackPoint != null) {
      buf.append(blackPoint.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -contrast-stretch (see ImageMagick-Documentation for details).
  */

  public IMOps contrastStretch(Integer blackPoint, Integer whitePoint) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-contrast-stretch");

    if (blackPoint != null) {
      buf.append(blackPoint.toString());
    }
    buf.append("x");
    if (whitePoint != null) {
      buf.append(whitePoint.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -contrast-stretch (see ImageMagick-Documentation for details).
  */

  public IMOps contrastStretch(Integer blackPoint, Integer whitePoint, Boolean percent) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-contrast-stretch");

    if (blackPoint != null) {
      buf.append(blackPoint.toString());
    }
    buf.append("x");
    if (whitePoint != null) {
      buf.append(whitePoint.toString());
    }
    if (percent != null) {
      if (percent.booleanValue())
        buf.append("%");
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -convolve (see ImageMagick-Documentation for details).
  */

  public IMOps convolve() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-convolve");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -convolve (see ImageMagick-Documentation for details).
  */

  public IMOps convolve(String kernel) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-convolve");

    if (kernel != null) {
      buf.append(kernel.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -crop (see ImageMagick-Documentation for details).
  */

  public IMOps crop() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-crop");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -crop (see ImageMagick-Documentation for details).
  */

  public IMOps crop(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-crop");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -crop (see ImageMagick-Documentation for details).
  */

  public IMOps crop(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-crop");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -crop (see ImageMagick-Documentation for details).
  */

  public IMOps crop(Integer width, Integer height, Integer x) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-crop");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -crop (see ImageMagick-Documentation for details).
  */

  public IMOps crop(Integer width, Integer height, Integer x, Integer y) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-crop");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -crop (see ImageMagick-Documentation for details).
  */

  public IMOps crop(Integer width, Integer height, Integer x, Integer y, Character special) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-crop");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
    }
    if (special != null) {
      buf.append(special.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -cycle (see ImageMagick-Documentation for details).
  */

  public IMOps cycle() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-cycle");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -cycle (see ImageMagick-Documentation for details).
  */

  public IMOps cycle(Integer amount) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-cycle");

    if (amount != null) {
      buf.append(amount.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +debug (see ImageMagick-Documentation for details).
  */

  public IMOps p_debug() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+debug");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -debug (see ImageMagick-Documentation for details).
  */

  public IMOps debug() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-debug");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -debug (see ImageMagick-Documentation for details).
  */

  public IMOps debug(String events) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-debug");

    if (events != null) {
      buf.append(events.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -decipher (see ImageMagick-Documentation for details).
  */

  public IMOps decipher() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-decipher");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -decipher (see ImageMagick-Documentation for details).
  */

  public IMOps decipher(String filename) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-decipher");

    if (filename != null) {
      buf.append(filename.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -deconstruct (see ImageMagick-Documentation for details).
  */

  public IMOps deconstruct() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-deconstruct");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +define (see ImageMagick-Documentation for details).
  */

  public IMOps p_define() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+define");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +define (see ImageMagick-Documentation for details).
  */

  public IMOps p_define(String key) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+define");

    if (key != null) {
      buf.append(key.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -define (see ImageMagick-Documentation for details).
  */

  public IMOps define() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-define");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -define (see ImageMagick-Documentation for details).
  */

  public IMOps define(String keyValue) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-define");

    if (keyValue != null) {
      buf.append(keyValue.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -delay (see ImageMagick-Documentation for details).
  */

  public IMOps delay() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-delay");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -delay (see ImageMagick-Documentation for details).
  */

  public IMOps delay(Integer ticks) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-delay");

    if (ticks != null) {
      buf.append(ticks.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -delay (see ImageMagick-Documentation for details).
  */

  public IMOps delay(Integer ticks, Integer ticksPerSecond) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-delay");

    if (ticks != null) {
      buf.append(ticks.toString());
    }
    buf.append("x");
    if (ticksPerSecond != null) {
      buf.append(ticksPerSecond.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -delay (see ImageMagick-Documentation for details).
  */

  public IMOps delay(Integer ticks, Integer ticksPerSecond, Character special) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-delay");

    if (ticks != null) {
      buf.append(ticks.toString());
    }
    buf.append("x");
    if (ticksPerSecond != null) {
      buf.append(ticksPerSecond.toString());
    }
    if (special != null) {
      buf.append(special.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +delete (see ImageMagick-Documentation for details).
  */

  public IMOps p_delete() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+delete");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -delete (see ImageMagick-Documentation for details).
  */

  public IMOps delete() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-delete");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -delete (see ImageMagick-Documentation for details).
  */

  public IMOps delete(Integer index1) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-delete");

    if (index1 != null) {
      buf.append(index1.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -delete (see ImageMagick-Documentation for details).
  */

  public IMOps delete(Integer index1, Integer index2) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-delete");

    if (index1 != null) {
      buf.append(index1.toString());
    }
    buf.append(",");
    if (index2 != null) {
      buf.append(index2.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -delete (see ImageMagick-Documentation for details).
  */

  public IMOps delete(Integer index1, Integer index2, Integer index3) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-delete");

    if (index1 != null) {
      buf.append(index1.toString());
    }
    buf.append(",");
    if (index2 != null) {
      buf.append(index2.toString());
    }
    buf.append(",");
    if (index3 != null) {
      buf.append(index3.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -delete (see ImageMagick-Documentation for details).
  */

  public IMOps delete(String indexes) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-delete");

    if (indexes != null) {
      buf.append(indexes.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -density (see ImageMagick-Documentation for details).
  */

  public IMOps density() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-density");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -density (see ImageMagick-Documentation for details).
  */

  public IMOps density(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-density");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -density (see ImageMagick-Documentation for details).
  */

  public IMOps density(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-density");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -depth (see ImageMagick-Documentation for details).
  */

  public IMOps depth() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-depth");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -depth (see ImageMagick-Documentation for details).
  */

  public IMOps depth(Integer value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-depth");

    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -descend (see ImageMagick-Documentation for details).
  */

  public IMOps descend() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-descend");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -deskew (see ImageMagick-Documentation for details).
  */

  public IMOps deskew() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-deskew");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -deskew (see ImageMagick-Documentation for details).
  */

  public IMOps deskew(Double threshold) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-deskew");

    if (threshold != null) {
      buf.append(threshold.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -despeckle (see ImageMagick-Documentation for details).
  */

  public IMOps despeckle() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-despeckle");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -displace (see ImageMagick-Documentation for details).
  */

  public IMOps displace() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-displace");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -displace (see ImageMagick-Documentation for details).
  */

  public IMOps displace(Double horizontalScale) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-displace");

    if (horizontalScale != null) {
      buf.append(horizontalScale.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -displace (see ImageMagick-Documentation for details).
  */

  public IMOps displace(Double horizontalScale, Double verticalScale) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-displace");

    if (horizontalScale != null) {
      buf.append(horizontalScale.toString());
    }
    buf.append("x");
    if (verticalScale != null) {
      buf.append(verticalScale.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -display (see ImageMagick-Documentation for details).
  */

  public IMOps display() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-display");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -display (see ImageMagick-Documentation for details).
  */

  public IMOps display(String host) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-display");

    if (host != null) {
      buf.append(host.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -display (see ImageMagick-Documentation for details).
  */

  public IMOps display(String host, Integer display) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-display");

    if (host != null) {
      buf.append(host.toString());
    }
    buf.append(":");
    if (display != null) {
      buf.append(display.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -display (see ImageMagick-Documentation for details).
  */

  public IMOps display(String host, Integer display, Integer screen) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-display");

    if (host != null) {
      buf.append(host.toString());
    }
    buf.append(":");
    if (display != null) {
      buf.append(display.toString());
    }
    buf.append(".");
    if (screen != null) {
      buf.append(screen.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +dispose (see ImageMagick-Documentation for details).
  */

  public IMOps p_dispose() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+dispose");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -dispose (see ImageMagick-Documentation for details).
  */

  public IMOps dispose() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-dispose");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -dispose (see ImageMagick-Documentation for details).
  */

  public IMOps dispose(String method) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-dispose");

    if (method != null) {
      buf.append(method.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -dissolve (see ImageMagick-Documentation for details).
  */

  public IMOps dissolve() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-dissolve");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -dissolve (see ImageMagick-Documentation for details).
  */

  public IMOps dissolve(Integer percent) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-dissolve");

    if (percent != null) {
      buf.append(percent.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -distort (see ImageMagick-Documentation for details).
  */

  public IMOps distort() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-distort");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -distort (see ImageMagick-Documentation for details).
  */

  public IMOps distort(String method) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-distort");

    if (method != null) {
      buf.append(method.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -distort (see ImageMagick-Documentation for details).
  */

  public IMOps distort(String method, String arguments) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-distort");

    if (method != null) {
      buf.append(method.toString());
    }
    iCmdArgs.add(buf.toString());
    buf.setLength(0);
    if (arguments != null) {
      buf.append(arguments.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +distort (see ImageMagick-Documentation for details).
  */

  public IMOps p_distort() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+distort");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +distort (see ImageMagick-Documentation for details).
  */

  public IMOps p_distort(String method) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+distort");

    if (method != null) {
      buf.append(method.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +distort (see ImageMagick-Documentation for details).
  */

  public IMOps p_distort(String method, String arguments) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+distort");

    if (method != null) {
      buf.append(method.toString());
    }
    iCmdArgs.add(buf.toString());
    buf.setLength(0);
    if (arguments != null) {
      buf.append(arguments.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +dither (see ImageMagick-Documentation for details).
  */

  public IMOps p_dither() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+dither");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -dither (see ImageMagick-Documentation for details).
  */

  public IMOps dither() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-dither");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -dither (see ImageMagick-Documentation for details).
  */

  public IMOps dither(String method) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-dither");

    if (method != null) {
      buf.append(method.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -draw (see ImageMagick-Documentation for details).
  */

  public IMOps draw() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-draw");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -draw (see ImageMagick-Documentation for details).
  */

  public IMOps draw(String string) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-draw");

    if (string != null) {
      buf.append(string.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -edge (see ImageMagick-Documentation for details).
  */

  public IMOps edge() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-edge");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -edge (see ImageMagick-Documentation for details).
  */

  public IMOps edge(Double radius) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-edge");

    if (radius != null) {
      buf.append(radius.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -emboss (see ImageMagick-Documentation for details).
  */

  public IMOps emboss() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-emboss");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -emboss (see ImageMagick-Documentation for details).
  */

  public IMOps emboss(Double radius) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-emboss");

    if (radius != null) {
      buf.append(radius.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -encipher (see ImageMagick-Documentation for details).
  */

  public IMOps encipher() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-encipher");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -encipher (see ImageMagick-Documentation for details).
  */

  public IMOps encipher(String filename) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-encipher");

    if (filename != null) {
      buf.append(filename.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -encoding (see ImageMagick-Documentation for details).
  */

  public IMOps encoding() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-encoding");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -encoding (see ImageMagick-Documentation for details).
  */

  public IMOps encoding(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-encoding");

    if (type != null) {
      buf.append(type.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +endian (see ImageMagick-Documentation for details).
  */

  public IMOps p_endian() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+endian");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -endian (see ImageMagick-Documentation for details).
  */

  public IMOps endian() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-endian");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -endian (see ImageMagick-Documentation for details).
  */

  public IMOps endian(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-endian");

    if (type != null) {
      buf.append(type.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -enhance (see ImageMagick-Documentation for details).
  */

  public IMOps enhance() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-enhance");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -equalize (see ImageMagick-Documentation for details).
  */

  public IMOps equalize() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-equalize");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -evaluate (see ImageMagick-Documentation for details).
  */

  public IMOps evaluate() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-evaluate");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -evaluate (see ImageMagick-Documentation for details).
  */

  public IMOps evaluate(String operator) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-evaluate");

    if (operator != null) {
      buf.append(operator.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -evaluate (see ImageMagick-Documentation for details).
  */

  public IMOps evaluate(String operator, String constant) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-evaluate");

    if (operator != null) {
      buf.append(operator.toString());
    }
    iCmdArgs.add(buf.toString());
    buf.setLength(0);
    if (constant != null) {
      buf.append(constant.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -extent (see ImageMagick-Documentation for details).
  */

  public IMOps extent() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-extent");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -extent (see ImageMagick-Documentation for details).
  */

  public IMOps extent(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-extent");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -extent (see ImageMagick-Documentation for details).
  */

  public IMOps extent(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-extent");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -extent (see ImageMagick-Documentation for details).
  */

  public IMOps extent(Integer width, Integer height, Integer xOffset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-extent");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (xOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (xOffset != null) {
      buf.append(xOffset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -extent (see ImageMagick-Documentation for details).
  */

  public IMOps extent(Integer width, Integer height, Integer xOffset, Integer yOffset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-extent");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (xOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (xOffset != null) {
      buf.append(xOffset.toString());
    }
    oper="+";
    if (yOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (yOffset != null) {
      buf.append(yOffset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -extract (see ImageMagick-Documentation for details).
  */

  public IMOps extract() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-extract");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -extract (see ImageMagick-Documentation for details).
  */

  public IMOps extract(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-extract");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -extract (see ImageMagick-Documentation for details).
  */

  public IMOps extract(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-extract");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -extract (see ImageMagick-Documentation for details).
  */

  public IMOps extract(Integer width, Integer height, Integer xOffset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-extract");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (xOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (xOffset != null) {
      buf.append(xOffset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -extract (see ImageMagick-Documentation for details).
  */

  public IMOps extract(Integer width, Integer height, Integer xOffset, Integer yOffset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-extract");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (xOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (xOffset != null) {
      buf.append(xOffset.toString());
    }
    oper="+";
    if (yOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (yOffset != null) {
      buf.append(yOffset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -fill (see ImageMagick-Documentation for details).
  */

  public IMOps fill() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-fill");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -fill (see ImageMagick-Documentation for details).
  */

  public IMOps fill(String color) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-fill");

    if (color != null) {
      buf.append(color.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -filter (see ImageMagick-Documentation for details).
  */

  public IMOps filter() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-filter");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -filter (see ImageMagick-Documentation for details).
  */

  public IMOps filter(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-filter");

    if (type != null) {
      buf.append(type.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -flatten (see ImageMagick-Documentation for details).
  */

  public IMOps flatten() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-flatten");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -flip (see ImageMagick-Documentation for details).
  */

  public IMOps flip() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-flip");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -floodfill (see ImageMagick-Documentation for details).
  */

  public IMOps floodfill() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-floodfill");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -floodfill (see ImageMagick-Documentation for details).
  */

  public IMOps floodfill(Integer x) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-floodfill");

    if (x != null) {
      buf.append(x.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -floodfill (see ImageMagick-Documentation for details).
  */

  public IMOps floodfill(Integer x, Integer y) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-floodfill");

    if (x != null) {
      buf.append(x.toString());
    }
    iCmdArgs.add(buf.toString());
    buf.setLength(0);
    if (y != null) {
      buf.append(y.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -floodfill (see ImageMagick-Documentation for details).
  */

  public IMOps floodfill(Integer x, Integer y, String color) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-floodfill");

    if (x != null) {
      buf.append(x.toString());
    }
    iCmdArgs.add(buf.toString());
    buf.setLength(0);
    if (y != null) {
      buf.append(y.toString());
    }
    iCmdArgs.add(buf.toString());
    buf.setLength(0);
    if (color != null) {
      buf.append(color.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -flop (see ImageMagick-Documentation for details).
  */

  public IMOps flop() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-flop");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -font (see ImageMagick-Documentation for details).
  */

  public IMOps font() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-font");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -font (see ImageMagick-Documentation for details).
  */

  public IMOps font(String name) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-font");

    if (name != null) {
      buf.append(name.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -foreground (see ImageMagick-Documentation for details).
  */

  public IMOps foreground() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-foreground");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -foreground (see ImageMagick-Documentation for details).
  */

  public IMOps foreground(String color) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-foreground");

    if (color != null) {
      buf.append(color.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -format (see ImageMagick-Documentation for details).
  */

  public IMOps format() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-format");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -format (see ImageMagick-Documentation for details).
  */

  public IMOps format(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-format");

    if (type != null) {
      buf.append(type.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -frame (see ImageMagick-Documentation for details).
  */

  public IMOps frame() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-frame");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -frame (see ImageMagick-Documentation for details).
  */

  public IMOps frame(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-frame");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -frame (see ImageMagick-Documentation for details).
  */

  public IMOps frame(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-frame");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -frame (see ImageMagick-Documentation for details).
  */

  public IMOps frame(Integer width, Integer height, Integer outerBevelWidth) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-frame");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (outerBevelWidth.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (outerBevelWidth != null) {
      buf.append(outerBevelWidth.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -frame (see ImageMagick-Documentation for details).
  */

  public IMOps frame(Integer width, Integer height, Integer outerBevelWidth, Integer innerBevelWidth) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-frame");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (outerBevelWidth.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (outerBevelWidth != null) {
      buf.append(outerBevelWidth.toString());
    }
    oper="+";
    if (innerBevelWidth.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (innerBevelWidth != null) {
      buf.append(innerBevelWidth.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -fuzz (see ImageMagick-Documentation for details).
  */

  public IMOps fuzz() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-fuzz");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -fuzz (see ImageMagick-Documentation for details).
  */

  public IMOps fuzz(Double distance) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-fuzz");

    if (distance != null) {
      buf.append(distance.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -fuzz (see ImageMagick-Documentation for details).
  */

  public IMOps fuzz(Double distance, Boolean percent) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-fuzz");

    if (distance != null) {
      buf.append(distance.toString());
    }
    if (percent != null) {
      if (percent.booleanValue())
        buf.append("%");
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -fx (see ImageMagick-Documentation for details).
  */

  public IMOps fx() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-fx");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -fx (see ImageMagick-Documentation for details).
  */

  public IMOps fx(String expression) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-fx");

    if (expression != null) {
      buf.append(expression.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -gamma (see ImageMagick-Documentation for details).
  */

  public IMOps gamma() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-gamma");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -gamma (see ImageMagick-Documentation for details).
  */

  public IMOps gamma(Double value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-gamma");

    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +gamma (see ImageMagick-Documentation for details).
  */

  public IMOps p_gamma() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+gamma");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +gamma (see ImageMagick-Documentation for details).
  */

  public IMOps p_gamma(Double value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+gamma");

    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -gaussian-blur (see ImageMagick-Documentation for details).
  */

  public IMOps gaussianBlur() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-gaussian-blur");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -gaussian-blur (see ImageMagick-Documentation for details).
  */

  public IMOps gaussianBlur(Double radius) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-gaussian-blur");

    if (radius != null) {
      buf.append(radius.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -gaussian-blur (see ImageMagick-Documentation for details).
  */

  public IMOps gaussianBlur(Double radius, Double sigma) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-gaussian-blur");

    if (radius != null) {
      buf.append(radius.toString());
    }
    buf.append("x");
    if (sigma != null) {
      buf.append(sigma.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -geometry (see ImageMagick-Documentation for details).
  */

  public IMOps geometry() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-geometry");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -geometry (see ImageMagick-Documentation for details).
  */

  public IMOps geometry(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-geometry");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -geometry (see ImageMagick-Documentation for details).
  */

  public IMOps geometry(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-geometry");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -geometry (see ImageMagick-Documentation for details).
  */

  public IMOps geometry(Integer width, Integer height, Integer x) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-geometry");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -geometry (see ImageMagick-Documentation for details).
  */

  public IMOps geometry(Integer width, Integer height, Integer x, Integer y) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-geometry");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -gravity (see ImageMagick-Documentation for details).
  */

  public IMOps gravity() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-gravity");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -gravity (see ImageMagick-Documentation for details).
  */

  public IMOps gravity(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-gravity");

    if (type != null) {
      buf.append(type.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -green-primary (see ImageMagick-Documentation for details).
  */

  public IMOps greenPrimary() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-green-primary");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -green-primary (see ImageMagick-Documentation for details).
  */

  public IMOps greenPrimary(Double x) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-green-primary");

    if (x != null) {
      buf.append(x.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -green-primary (see ImageMagick-Documentation for details).
  */

  public IMOps greenPrimary(Double x, Double y) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-green-primary");

    if (x != null) {
      buf.append(x.toString());
    }
    buf.append(",");
    if (y != null) {
      buf.append(y.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -help (see ImageMagick-Documentation for details).
  */

  public IMOps help() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-help");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -highlight-color (see ImageMagick-Documentation for details).
  */

  public IMOps highlightColor() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-highlight-color");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -highlight-color (see ImageMagick-Documentation for details).
  */

  public IMOps highlightColor(String color) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-highlight-color");

    if (color != null) {
      buf.append(color.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -iconGeometry (see ImageMagick-Documentation for details).
  */

  public IMOps iconGeometry() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-iconGeometry");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -iconGeometry (see ImageMagick-Documentation for details).
  */

  public IMOps iconGeometry(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-iconGeometry");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -iconGeometry (see ImageMagick-Documentation for details).
  */

  public IMOps iconGeometry(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-iconGeometry");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -iconGeometry (see ImageMagick-Documentation for details).
  */

  public IMOps iconGeometry(Integer width, Integer height, Integer xOffset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-iconGeometry");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (xOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (xOffset != null) {
      buf.append(xOffset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -iconGeometry (see ImageMagick-Documentation for details).
  */

  public IMOps iconGeometry(Integer width, Integer height, Integer xOffset, Integer yOffset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-iconGeometry");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (xOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (xOffset != null) {
      buf.append(xOffset.toString());
    }
    oper="+";
    if (yOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (yOffset != null) {
      buf.append(yOffset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -iconic (see ImageMagick-Documentation for details).
  */

  public IMOps iconic() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-iconic");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -identify (see ImageMagick-Documentation for details).
  */

  public IMOps identify() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-identify");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -immutable (see ImageMagick-Documentation for details).
  */

  public IMOps immutable() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-immutable");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -implode (see ImageMagick-Documentation for details).
  */

  public IMOps implode() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-implode");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -implode (see ImageMagick-Documentation for details).
  */

  public IMOps implode(Double factor) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-implode");

    if (factor != null) {
      buf.append(factor.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -insert (see ImageMagick-Documentation for details).
  */

  public IMOps insert() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-insert");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -insert (see ImageMagick-Documentation for details).
  */

  public IMOps insert(Integer index) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-insert");

    if (index != null) {
      buf.append(index.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -intent (see ImageMagick-Documentation for details).
  */

  public IMOps intent() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-intent");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -intent (see ImageMagick-Documentation for details).
  */

  public IMOps intent(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-intent");

    if (type != null) {
      buf.append(type.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -interlace (see ImageMagick-Documentation for details).
  */

  public IMOps interlace() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-interlace");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -interlace (see ImageMagick-Documentation for details).
  */

  public IMOps interlace(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-interlace");

    if (type != null) {
      buf.append(type.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -interpolate (see ImageMagick-Documentation for details).
  */

  public IMOps interpolate() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-interpolate");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -interpolate (see ImageMagick-Documentation for details).
  */

  public IMOps interpolate(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-interpolate");

    if (type != null) {
      buf.append(type.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -interword-spacing (see ImageMagick-Documentation for details).
  */

  public IMOps interwordSpacing() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-interword-spacing");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -interword-spacing (see ImageMagick-Documentation for details).
  */

  public IMOps interwordSpacing(Integer value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-interword-spacing");

    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -kerning (see ImageMagick-Documentation for details).
  */

  public IMOps kerning() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-kerning");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -kerning (see ImageMagick-Documentation for details).
  */

  public IMOps kerning(Integer value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-kerning");

    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +label (see ImageMagick-Documentation for details).
  */

  public IMOps p_label() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+label");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -label (see ImageMagick-Documentation for details).
  */

  public IMOps label() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-label");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -label (see ImageMagick-Documentation for details).
  */

  public IMOps label(String name) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-label");

    if (name != null) {
      buf.append(name.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -lat (see ImageMagick-Documentation for details).
  */

  public IMOps lat() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-lat");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -lat (see ImageMagick-Documentation for details).
  */

  public IMOps lat(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-lat");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -lat (see ImageMagick-Documentation for details).
  */

  public IMOps lat(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-lat");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -lat (see ImageMagick-Documentation for details).
  */

  public IMOps lat(Integer width, Integer height, Integer offset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-lat");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (offset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (offset != null) {
      buf.append(offset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -lat (see ImageMagick-Documentation for details).
  */

  public IMOps lat(Integer width, Integer height, Integer offset, Boolean percent) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-lat");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (offset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (offset != null) {
      buf.append(offset.toString());
    }
    if (percent != null) {
      if (percent.booleanValue())
        buf.append("%");
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -layers (see ImageMagick-Documentation for details).
  */

  public IMOps layers() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-layers");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -layers (see ImageMagick-Documentation for details).
  */

  public IMOps layers(String method) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-layers");

    if (method != null) {
      buf.append(method.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -level-colors (see ImageMagick-Documentation for details).
  */

  public IMOps levelColors() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-level-colors");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -level-colors (see ImageMagick-Documentation for details).
  */

  public IMOps levelColors(String black_color) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-level-colors");

    if (black_color != null) {
      buf.append(black_color.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -level-colors (see ImageMagick-Documentation for details).
  */

  public IMOps levelColors(String black_color, String white_color) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-level-colors");

    if (black_color != null) {
      buf.append(black_color.toString());
    }
    buf.append(",");
    if (white_color != null) {
      buf.append(white_color.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +level-colors (see ImageMagick-Documentation for details).
  */

  public IMOps p_levelColors() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+level-colors");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +level-colors (see ImageMagick-Documentation for details).
  */

  public IMOps p_levelColors(String black_color) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+level-colors");

    if (black_color != null) {
      buf.append(black_color.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +level-colors (see ImageMagick-Documentation for details).
  */

  public IMOps p_levelColors(String black_color, String white_color) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+level-colors");

    if (black_color != null) {
      buf.append(black_color.toString());
    }
    buf.append(",");
    if (white_color != null) {
      buf.append(white_color.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -level (see ImageMagick-Documentation for details).
  */

  public IMOps level(Double black_point) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-level");

    if (black_point != null) {
      buf.append(black_point.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -level (see ImageMagick-Documentation for details).
  */

  public IMOps level(Double black_point, Double white_point) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-level");

    if (black_point != null) {
      buf.append(black_point.toString());
    }
    buf.append(",");
    if (white_point != null) {
      buf.append(white_point.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -level (see ImageMagick-Documentation for details).
  */

  public IMOps level(Double black_point, Double white_point, Boolean percent) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-level");

    if (black_point != null) {
      buf.append(black_point.toString());
    }
    buf.append(",");
    if (white_point != null) {
      buf.append(white_point.toString());
    }
    if (percent != null) {
      if (percent.booleanValue())
        buf.append("%");
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -level (see ImageMagick-Documentation for details).
  */

  public IMOps level(Double black_point, Double white_point, Boolean percent, Double gamma) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-level");

    if (black_point != null) {
      buf.append(black_point.toString());
    }
    buf.append(",");
    if (white_point != null) {
      buf.append(white_point.toString());
    }
    if (percent != null) {
      if (percent.booleanValue())
        buf.append("%");
    }
    buf.append(",");
    if (gamma != null) {
      buf.append(gamma.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +level (see ImageMagick-Documentation for details).
  */

  public IMOps p_level(Double black_point) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+level");

    if (black_point != null) {
      buf.append(black_point.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +level (see ImageMagick-Documentation for details).
  */

  public IMOps p_level(Double black_point, Double white_point) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+level");

    if (black_point != null) {
      buf.append(black_point.toString());
    }
    buf.append(",");
    if (white_point != null) {
      buf.append(white_point.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +level (see ImageMagick-Documentation for details).
  */

  public IMOps p_level(Double black_point, Double white_point, Boolean percent) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+level");

    if (black_point != null) {
      buf.append(black_point.toString());
    }
    buf.append(",");
    if (white_point != null) {
      buf.append(white_point.toString());
    }
    if (percent != null) {
      if (percent.booleanValue())
        buf.append("%");
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +level (see ImageMagick-Documentation for details).
  */

  public IMOps p_level(Double black_point, Double white_point, Boolean percent, Double gamma) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+level");

    if (black_point != null) {
      buf.append(black_point.toString());
    }
    buf.append(",");
    if (white_point != null) {
      buf.append(white_point.toString());
    }
    if (percent != null) {
      if (percent.booleanValue())
        buf.append("%");
    }
    buf.append(",");
    if (gamma != null) {
      buf.append(gamma.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -limit (see ImageMagick-Documentation for details).
  */

  public IMOps limit() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-limit");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -limit (see ImageMagick-Documentation for details).
  */

  public IMOps limit(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-limit");

    if (type != null) {
      buf.append(type.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -linear-stretch (see ImageMagick-Documentation for details).
  */

  public IMOps linearStretch() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-linear-stretch");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -linear-stretch (see ImageMagick-Documentation for details).
  */

  public IMOps linearStretch(Double blackPoint) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-linear-stretch");

    if (blackPoint != null) {
      buf.append(blackPoint.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -linear-stretch (see ImageMagick-Documentation for details).
  */

  public IMOps linearStretch(Double blackPoint, Double whitePoint) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-linear-stretch");

    if (blackPoint != null) {
      buf.append(blackPoint.toString());
    }
    buf.append("x");
    if (whitePoint != null) {
      buf.append(whitePoint.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -linear-stretch (see ImageMagick-Documentation for details).
  */

  public IMOps linearStretch(Double blackPoint, Double whitePoint, Boolean percent) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-linear-stretch");

    if (blackPoint != null) {
      buf.append(blackPoint.toString());
    }
    buf.append("x");
    if (whitePoint != null) {
      buf.append(whitePoint.toString());
    }
    if (percent != null) {
      if (percent.booleanValue())
        buf.append("%");
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -linewidth (see ImageMagick-Documentation for details).
  */

  public IMOps linewidth() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-linewidth");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -liquid-rescale (see ImageMagick-Documentation for details).
  */

  public IMOps liquidRescale() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-liquid-rescale");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -liquid-rescale (see ImageMagick-Documentation for details).
  */

  public IMOps liquidRescale(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-liquid-rescale");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -liquid-rescale (see ImageMagick-Documentation for details).
  */

  public IMOps liquidRescale(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-liquid-rescale");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -liquid-rescale (see ImageMagick-Documentation for details).
  */

  public IMOps liquidRescale(Integer width, Integer height, Integer xOffset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-liquid-rescale");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (xOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (xOffset != null) {
      buf.append(xOffset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -liquid-rescale (see ImageMagick-Documentation for details).
  */

  public IMOps liquidRescale(Integer width, Integer height, Integer xOffset, Integer yOffset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-liquid-rescale");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (xOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (xOffset != null) {
      buf.append(xOffset.toString());
    }
    oper="+";
    if (yOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (yOffset != null) {
      buf.append(yOffset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -list (see ImageMagick-Documentation for details).
  */

  public IMOps list() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-list");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -list (see ImageMagick-Documentation for details).
  */

  public IMOps list(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-list");

    if (type != null) {
      buf.append(type.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -log (see ImageMagick-Documentation for details).
  */

  public IMOps log() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-log");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -log (see ImageMagick-Documentation for details).
  */

  public IMOps log(String text) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-log");

    if (text != null) {
      buf.append(text.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -loop (see ImageMagick-Documentation for details).
  */

  public IMOps loop() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-loop");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -loop (see ImageMagick-Documentation for details).
  */

  public IMOps loop(Integer iterations) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-loop");

    if (iterations != null) {
      buf.append(iterations.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -lowlight-color (see ImageMagick-Documentation for details).
  */

  public IMOps lowlightColor() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-lowlight-color");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -lowlight-color (see ImageMagick-Documentation for details).
  */

  public IMOps lowlightColor(String color) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-lowlight-color");

    if (color != null) {
      buf.append(color.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -magnify (see ImageMagick-Documentation for details).
  */

  public IMOps magnify() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-magnify");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -magnify (see ImageMagick-Documentation for details).
  */

  public IMOps magnify(Double factor) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-magnify");

    if (factor != null) {
      buf.append(factor.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +map (see ImageMagick-Documentation for details).
  */

  public IMOps p_map() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+map");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -map (see ImageMagick-Documentation for details).
  */

  public IMOps map() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-map");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -map (see ImageMagick-Documentation for details).
  */

  public IMOps map(String components) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-map");

    if (components != null) {
      buf.append(components.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +mask (see ImageMagick-Documentation for details).
  */

  public IMOps p_mask() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+mask");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -mask (see ImageMagick-Documentation for details).
  */

  public IMOps mask() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-mask");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -mask (see ImageMagick-Documentation for details).
  */

  public IMOps mask(String filename) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-mask");

    if (filename != null) {
      buf.append(filename.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -mattecolor (see ImageMagick-Documentation for details).
  */

  public IMOps mattecolor() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-mattecolor");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -mattecolor (see ImageMagick-Documentation for details).
  */

  public IMOps mattecolor(String color) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-mattecolor");

    if (color != null) {
      buf.append(color.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -median (see ImageMagick-Documentation for details).
  */

  public IMOps median() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-median");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -median (see ImageMagick-Documentation for details).
  */

  public IMOps median(Double radius) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-median");

    if (radius != null) {
      buf.append(radius.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -metric (see ImageMagick-Documentation for details).
  */

  public IMOps metric() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-metric");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -metric (see ImageMagick-Documentation for details).
  */

  public IMOps metric(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-metric");

    if (type != null) {
      buf.append(type.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -mode (see ImageMagick-Documentation for details).
  */

  public IMOps mode() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-mode");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -mode (see ImageMagick-Documentation for details).
  */

  public IMOps mode(String value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-mode");

    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -modulate (see ImageMagick-Documentation for details).
  */

  public IMOps modulate() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-modulate");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -modulate (see ImageMagick-Documentation for details).
  */

  public IMOps modulate(Double brightness) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-modulate");

    if (brightness != null) {
      buf.append(brightness.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -modulate (see ImageMagick-Documentation for details).
  */

  public IMOps modulate(Double brightness, Double saturation) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-modulate");

    if (brightness != null) {
      buf.append(brightness.toString());
    }
    buf.append(",");
    if (saturation != null) {
      buf.append(saturation.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -modulate (see ImageMagick-Documentation for details).
  */

  public IMOps modulate(Double brightness, Double saturation, Double hue) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-modulate");

    if (brightness != null) {
      buf.append(brightness.toString());
    }
    buf.append(",");
    if (saturation != null) {
      buf.append(saturation.toString());
    }
    buf.append(",");
    if (hue != null) {
      buf.append(hue.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -monitor (see ImageMagick-Documentation for details).
  */

  public IMOps monitor() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-monitor");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -monochrome (see ImageMagick-Documentation for details).
  */

  public IMOps monochrome() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-monochrome");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -morph (see ImageMagick-Documentation for details).
  */

  public IMOps morph() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-morph");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -morph (see ImageMagick-Documentation for details).
  */

  public IMOps morph(Integer frames) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-morph");

    if (frames != null) {
      buf.append(frames.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -mosaic (see ImageMagick-Documentation for details).
  */

  public IMOps mosaic() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-mosaic");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -motion-blur (see ImageMagick-Documentation for details).
  */

  public IMOps motionBlur() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-motion-blur");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -motion-blur (see ImageMagick-Documentation for details).
  */

  public IMOps motionBlur(Double radius) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-motion-blur");

    if (radius != null) {
      buf.append(radius.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -motion-blur (see ImageMagick-Documentation for details).
  */

  public IMOps motionBlur(Double radius, Double sigma) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-motion-blur");

    if (radius != null) {
      buf.append(radius.toString());
    }
    buf.append("x");
    if (sigma != null) {
      buf.append(sigma.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -motion-blur (see ImageMagick-Documentation for details).
  */

  public IMOps motionBlur(Double radius, Double sigma, Double angle) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-motion-blur");

    if (radius != null) {
      buf.append(radius.toString());
    }
    buf.append("x");
    if (sigma != null) {
      buf.append(sigma.toString());
    }
    oper="+";
    if (angle.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (angle != null) {
      buf.append(angle.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -name (see ImageMagick-Documentation for details).
  */

  public IMOps name() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-name");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -negate (see ImageMagick-Documentation for details).
  */

  public IMOps negate() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-negate");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +negate (see ImageMagick-Documentation for details).
  */

  public IMOps p_negate() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+negate");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -noise (see ImageMagick-Documentation for details).
  */

  public IMOps noise() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-noise");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -noise (see ImageMagick-Documentation for details).
  */

  public IMOps noise(Double radius) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-noise");

    if (radius != null) {
      buf.append(radius.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +noise (see ImageMagick-Documentation for details).
  */

  public IMOps p_noise() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+noise");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +noise (see ImageMagick-Documentation for details).
  */

  public IMOps p_noise(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+noise");

    if (type != null) {
      buf.append(type.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -normalize (see ImageMagick-Documentation for details).
  */

  public IMOps normalize() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-normalize");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -opaque (see ImageMagick-Documentation for details).
  */

  public IMOps opaque() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-opaque");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -opaque (see ImageMagick-Documentation for details).
  */

  public IMOps opaque(String color) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-opaque");

    if (color != null) {
      buf.append(color.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +opaque (see ImageMagick-Documentation for details).
  */

  public IMOps p_opaque() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+opaque");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +opaque (see ImageMagick-Documentation for details).
  */

  public IMOps p_opaque(String color) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+opaque");

    if (color != null) {
      buf.append(color.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -ordered-dither (see ImageMagick-Documentation for details).
  */

  public IMOps orderedDither() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-ordered-dither");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -ordered-dither (see ImageMagick-Documentation for details).
  */

  public IMOps orderedDither(String threshold_map) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-ordered-dither");

    if (threshold_map != null) {
      buf.append(threshold_map.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -ordered-dither (see ImageMagick-Documentation for details).
  */

  public IMOps orderedDither(String threshold_map, String level) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-ordered-dither");

    if (threshold_map != null) {
      buf.append(threshold_map.toString());
    }
    buf.append(",");
    if (level != null) {
      buf.append(level.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -orient (see ImageMagick-Documentation for details).
  */

  public IMOps orient() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-orient");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -orient (see ImageMagick-Documentation for details).
  */

  public IMOps orient(String imageOrientation) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-orient");

    if (imageOrientation != null) {
      buf.append(imageOrientation.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +page (see ImageMagick-Documentation for details).
  */

  public IMOps p_page() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+page");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -page (see ImageMagick-Documentation for details).
  */

  public IMOps page() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-page");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -page (see ImageMagick-Documentation for details).
  */

  public IMOps page(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-page");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -page (see ImageMagick-Documentation for details).
  */

  public IMOps page(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-page");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -page (see ImageMagick-Documentation for details).
  */

  public IMOps page(Integer width, Integer height, Integer x) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-page");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -page (see ImageMagick-Documentation for details).
  */

  public IMOps page(Integer width, Integer height, Integer x, Integer y) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-page");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -page (see ImageMagick-Documentation for details).
  */

  public IMOps page(Integer width, Integer height, Integer x, Integer y, Character special) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-page");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
    }
    if (special != null) {
      buf.append(special.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -paint (see ImageMagick-Documentation for details).
  */

  public IMOps paint() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-paint");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -paint (see ImageMagick-Documentation for details).
  */

  public IMOps paint(Double radius) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-paint");

    if (radius != null) {
      buf.append(radius.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -path (see ImageMagick-Documentation for details).
  */

  public IMOps path() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-path");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -path (see ImageMagick-Documentation for details).
  */

  public IMOps path(String path) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-path");

    if (path != null) {
      buf.append(path.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -pause (see ImageMagick-Documentation for details).
  */

  public IMOps pause() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-pause");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -pause (see ImageMagick-Documentation for details).
  */

  public IMOps pause(Integer seconds) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-pause");

    if (seconds != null) {
      buf.append(seconds.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -ping (see ImageMagick-Documentation for details).
  */

  public IMOps ping() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-ping");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -pointsize (see ImageMagick-Documentation for details).
  */

  public IMOps pointsize() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-pointsize");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -pointsize (see ImageMagick-Documentation for details).
  */

  public IMOps pointsize(Integer value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-pointsize");

    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -polaroid (see ImageMagick-Documentation for details).
  */

  public IMOps polaroid() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-polaroid");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -polaroid (see ImageMagick-Documentation for details).
  */

  public IMOps polaroid(Double angle) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-polaroid");

    if (angle != null) {
      buf.append(angle.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -posterize (see ImageMagick-Documentation for details).
  */

  public IMOps posterize() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-posterize");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -posterize (see ImageMagick-Documentation for details).
  */

  public IMOps posterize(Integer levels) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-posterize");

    if (levels != null) {
      buf.append(levels.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -preview (see ImageMagick-Documentation for details).
  */

  public IMOps preview() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-preview");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -preview (see ImageMagick-Documentation for details).
  */

  public IMOps preview(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-preview");

    if (type != null) {
      buf.append(type.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -print (see ImageMagick-Documentation for details).
  */

  public IMOps print() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-print");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -print (see ImageMagick-Documentation for details).
  */

  public IMOps print(String text) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-print");

    if (text != null) {
      buf.append(text.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -process (see ImageMagick-Documentation for details).
  */

  public IMOps process() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-process");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -process (see ImageMagick-Documentation for details).
  */

  public IMOps process(String command) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-process");

    if (command != null) {
      buf.append(command.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -profile (see ImageMagick-Documentation for details).
  */

  public IMOps profile() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-profile");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -profile (see ImageMagick-Documentation for details).
  */

  public IMOps profile(String filename) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-profile");

    if (filename != null) {
      buf.append(filename.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +profile (see ImageMagick-Documentation for details).
  */

  public IMOps p_profile() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+profile");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +profile (see ImageMagick-Documentation for details).
  */

  public IMOps p_profile(String profileName) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+profile");

    if (profileName != null) {
      buf.append(profileName.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -quality (see ImageMagick-Documentation for details).
  */

  public IMOps quality() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-quality");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -quality (see ImageMagick-Documentation for details).
  */

  public IMOps quality(Double value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-quality");

    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -quantize (see ImageMagick-Documentation for details).
  */

  public IMOps quantize() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-quantize");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -quantize (see ImageMagick-Documentation for details).
  */

  public IMOps quantize(String colorspace) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-quantize");

    if (colorspace != null) {
      buf.append(colorspace.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -quiet (see ImageMagick-Documentation for details).
  */

  public IMOps quiet() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-quiet");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -radial-blur (see ImageMagick-Documentation for details).
  */

  public IMOps radialBlur() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-radial-blur");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -radial-blur (see ImageMagick-Documentation for details).
  */

  public IMOps radialBlur(Double angle) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-radial-blur");

    if (angle != null) {
      buf.append(angle.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -raise (see ImageMagick-Documentation for details).
  */

  public IMOps raise() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-raise");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -raise (see ImageMagick-Documentation for details).
  */

  public IMOps raise(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-raise");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -raise (see ImageMagick-Documentation for details).
  */

  public IMOps raise(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-raise");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +raise (see ImageMagick-Documentation for details).
  */

  public IMOps p_raise() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+raise");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +raise (see ImageMagick-Documentation for details).
  */

  public IMOps p_raise(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+raise");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +raise (see ImageMagick-Documentation for details).
  */

  public IMOps p_raise(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+raise");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -random-threshold (see ImageMagick-Documentation for details).
  */

  public IMOps randomThreshold() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-random-threshold");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -random-threshold (see ImageMagick-Documentation for details).
  */

  public IMOps randomThreshold(Double low) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-random-threshold");

    if (low != null) {
      buf.append(low.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -random-threshold (see ImageMagick-Documentation for details).
  */

  public IMOps randomThreshold(Double low, Double high) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-random-threshold");

    if (low != null) {
      buf.append(low.toString());
    }
    buf.append("x");
    if (high != null) {
      buf.append(high.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -recolor (see ImageMagick-Documentation for details).
  */

  public IMOps recolor() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-recolor");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -recolor (see ImageMagick-Documentation for details).
  */

  public IMOps recolor(String matrix) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-recolor");

    if (matrix != null) {
      buf.append(matrix.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -red-primary (see ImageMagick-Documentation for details).
  */

  public IMOps redPrimary() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-red-primary");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -red-primary (see ImageMagick-Documentation for details).
  */

  public IMOps redPrimary(Double x) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-red-primary");

    if (x != null) {
      buf.append(x.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -red-primary (see ImageMagick-Documentation for details).
  */

  public IMOps redPrimary(Double x, Double y) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-red-primary");

    if (x != null) {
      buf.append(x.toString());
    }
    buf.append(",");
    if (y != null) {
      buf.append(y.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -regard-warnings (see ImageMagick-Documentation for details).
  */

  public IMOps regardWarnings() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-regard-warnings");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -region (see ImageMagick-Documentation for details).
  */

  public IMOps region() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-region");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -region (see ImageMagick-Documentation for details).
  */

  public IMOps region(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-region");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -region (see ImageMagick-Documentation for details).
  */

  public IMOps region(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-region");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -region (see ImageMagick-Documentation for details).
  */

  public IMOps region(Integer width, Integer height, Integer x) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-region");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -region (see ImageMagick-Documentation for details).
  */

  public IMOps region(Integer width, Integer height, Integer x, Integer y) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-region");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +remap (see ImageMagick-Documentation for details).
  */

  public IMOps p_remap() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+remap");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -remap (see ImageMagick-Documentation for details).
  */

  public IMOps remap() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-remap");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -remap (see ImageMagick-Documentation for details).
  */

  public IMOps remap(String filename) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-remap");

    if (filename != null) {
      buf.append(filename.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -remote (see ImageMagick-Documentation for details).
  */

  public IMOps remote() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-remote");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -render (see ImageMagick-Documentation for details).
  */

  public IMOps render() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-render");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +render (see ImageMagick-Documentation for details).
  */

  public IMOps p_render() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+render");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +repage (see ImageMagick-Documentation for details).
  */

  public IMOps p_repage() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+repage");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -repage (see ImageMagick-Documentation for details).
  */

  public IMOps repage() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-repage");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -repage (see ImageMagick-Documentation for details).
  */

  public IMOps repage(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-repage");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -repage (see ImageMagick-Documentation for details).
  */

  public IMOps repage(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-repage");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -repage (see ImageMagick-Documentation for details).
  */

  public IMOps repage(Integer width, Integer height, Integer xOffset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-repage");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (xOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (xOffset != null) {
      buf.append(xOffset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -repage (see ImageMagick-Documentation for details).
  */

  public IMOps repage(Integer width, Integer height, Integer xOffset, Integer yOffset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-repage");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (xOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (xOffset != null) {
      buf.append(xOffset.toString());
    }
    oper="+";
    if (yOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (yOffset != null) {
      buf.append(yOffset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -resample (see ImageMagick-Documentation for details).
  */

  public IMOps resample() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-resample");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -resample (see ImageMagick-Documentation for details).
  */

  public IMOps resample(Integer horizontal) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-resample");

    if (horizontal != null) {
      buf.append(horizontal.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -resample (see ImageMagick-Documentation for details).
  */

  public IMOps resample(Integer horizontal, Integer vertical) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-resample");

    if (horizontal != null) {
      buf.append(horizontal.toString());
    }
    buf.append("x");
    if (vertical != null) {
      buf.append(vertical.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -resize (see ImageMagick-Documentation for details).
  */

  public IMOps resize() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-resize");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -resize (see ImageMagick-Documentation for details).
  */

  public IMOps resize(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-resize");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -resize (see ImageMagick-Documentation for details).
  */

  public IMOps resize(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-resize");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -resize (see ImageMagick-Documentation for details).
  */

  public IMOps resize(Integer width, Integer height, Character special) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-resize");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (special != null) {
      buf.append(special.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -respect-parenthesis (see ImageMagick-Documentation for details).
  */

  public IMOps respectParenthesis() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-respect-parenthesis");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -reverse (see ImageMagick-Documentation for details).
  */

  public IMOps reverse() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-reverse");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -roll (see ImageMagick-Documentation for details).
  */

  public IMOps roll() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-roll");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -roll (see ImageMagick-Documentation for details).
  */

  public IMOps roll(Integer x) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-roll");

    if (x != null) {
      buf.append(x.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -roll (see ImageMagick-Documentation for details).
  */

  public IMOps roll(Integer x, Integer y) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-roll");

    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -rotate (see ImageMagick-Documentation for details).
  */

  public IMOps rotate() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-rotate");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -rotate (see ImageMagick-Documentation for details).
  */

  public IMOps rotate(Double degrees) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-rotate");

    if (degrees != null) {
      buf.append(degrees.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -rotate (see ImageMagick-Documentation for details).
  */

  public IMOps rotate(Double degrees, Character special) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-rotate");

    if (degrees != null) {
      buf.append(degrees.toString());
    }
    if (special != null) {
      buf.append(special.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sample (see ImageMagick-Documentation for details).
  */

  public IMOps sample() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sample");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sample (see ImageMagick-Documentation for details).
  */

  public IMOps sample(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sample");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sample (see ImageMagick-Documentation for details).
  */

  public IMOps sample(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sample");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sample (see ImageMagick-Documentation for details).
  */

  public IMOps sample(Integer width, Integer height, Integer xOffset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sample");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (xOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (xOffset != null) {
      buf.append(xOffset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sample (see ImageMagick-Documentation for details).
  */

  public IMOps sample(Integer width, Integer height, Integer xOffset, Integer yOffset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sample");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (xOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (xOffset != null) {
      buf.append(xOffset.toString());
    }
    oper="+";
    if (yOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (yOffset != null) {
      buf.append(yOffset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sampling-factor (see ImageMagick-Documentation for details).
  */

  public IMOps samplingFactor() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sampling-factor");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sampling-factor (see ImageMagick-Documentation for details).
  */

  public IMOps samplingFactor(Double horizontalFactor) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sampling-factor");

    if (horizontalFactor != null) {
      buf.append(horizontalFactor.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sampling-factor (see ImageMagick-Documentation for details).
  */

  public IMOps samplingFactor(Double horizontalFactor, Double verticalFactor) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sampling-factor");

    if (horizontalFactor != null) {
      buf.append(horizontalFactor.toString());
    }
    buf.append("x");
    if (verticalFactor != null) {
      buf.append(verticalFactor.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sarse-color (see ImageMagick-Documentation for details).
  */

  public IMOps sarseColor() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sarse-color");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sarse-color (see ImageMagick-Documentation for details).
  */

  public IMOps sarseColor(String method) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sarse-color");

    if (method != null) {
      buf.append(method.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sarse-color (see ImageMagick-Documentation for details).
  */

  public IMOps sarseColor(String method, String cinfo) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sarse-color");

    if (method != null) {
      buf.append(method.toString());
    }
    iCmdArgs.add(buf.toString());
    buf.setLength(0);
    if (cinfo != null) {
      buf.append(cinfo.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -scale (see ImageMagick-Documentation for details).
  */

  public IMOps scale() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-scale");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -scale (see ImageMagick-Documentation for details).
  */

  public IMOps scale(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-scale");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -scale (see ImageMagick-Documentation for details).
  */

  public IMOps scale(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-scale");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -scale (see ImageMagick-Documentation for details).
  */

  public IMOps scale(Integer width, Integer height, Integer xOffset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-scale");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (xOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (xOffset != null) {
      buf.append(xOffset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -scale (see ImageMagick-Documentation for details).
  */

  public IMOps scale(Integer width, Integer height, Integer xOffset, Integer yOffset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-scale");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (xOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (xOffset != null) {
      buf.append(xOffset.toString());
    }
    oper="+";
    if (yOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (yOffset != null) {
      buf.append(yOffset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -scene (see ImageMagick-Documentation for details).
  */

  public IMOps scene() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-scene");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -scene (see ImageMagick-Documentation for details).
  */

  public IMOps scene(Integer value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-scene");

    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -screen (see ImageMagick-Documentation for details).
  */

  public IMOps screen() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-screen");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -seed (see ImageMagick-Documentation for details).
  */

  public IMOps seed() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-seed");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -segment (see ImageMagick-Documentation for details).
  */

  public IMOps segment() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-segment");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -segment (see ImageMagick-Documentation for details).
  */

  public IMOps segment(Integer clusterThreshold) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-segment");

    if (clusterThreshold != null) {
      buf.append(clusterThreshold.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -segment (see ImageMagick-Documentation for details).
  */

  public IMOps segment(Integer clusterThreshold, Double smoothingThreshold) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-segment");

    if (clusterThreshold != null) {
      buf.append(clusterThreshold.toString());
    }
    buf.append("x");
    if (smoothingThreshold != null) {
      buf.append(smoothingThreshold.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -separate (see ImageMagick-Documentation for details).
  */

  public IMOps separate() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-separate");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sepia-tone (see ImageMagick-Documentation for details).
  */

  public IMOps sepiaTone() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sepia-tone");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sepia-tone (see ImageMagick-Documentation for details).
  */

  public IMOps sepiaTone(Double threshold) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sepia-tone");

    if (threshold != null) {
      buf.append(threshold.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -set (see ImageMagick-Documentation for details).
  */

  public IMOps set() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-set");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -set (see ImageMagick-Documentation for details).
  */

  public IMOps set(String attribute) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-set");

    if (attribute != null) {
      buf.append(attribute.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -set (see ImageMagick-Documentation for details).
  */

  public IMOps set(String attribute, String value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-set");

    if (attribute != null) {
      buf.append(attribute.toString());
    }
    iCmdArgs.add(buf.toString());
    buf.setLength(0);
    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -shade (see ImageMagick-Documentation for details).
  */

  public IMOps shade() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-shade");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -shade (see ImageMagick-Documentation for details).
  */

  public IMOps shade(Double azimuth) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-shade");

    if (azimuth != null) {
      buf.append(azimuth.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -shade (see ImageMagick-Documentation for details).
  */

  public IMOps shade(Double azimuth, Double elevation) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-shade");

    if (azimuth != null) {
      buf.append(azimuth.toString());
    }
    buf.append("x");
    if (elevation != null) {
      buf.append(elevation.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +shade (see ImageMagick-Documentation for details).
  */

  public IMOps p_shade() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+shade");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +shade (see ImageMagick-Documentation for details).
  */

  public IMOps p_shade(Double azimuth) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+shade");

    if (azimuth != null) {
      buf.append(azimuth.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +shade (see ImageMagick-Documentation for details).
  */

  public IMOps p_shade(Double azimuth, Double elevation) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+shade");

    if (azimuth != null) {
      buf.append(azimuth.toString());
    }
    buf.append("x");
    if (elevation != null) {
      buf.append(elevation.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -shadow (see ImageMagick-Documentation for details).
  */

  public IMOps shadow() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-shadow");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -shadow (see ImageMagick-Documentation for details).
  */

  public IMOps shadow(Integer percentOpacity) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-shadow");

    if (percentOpacity != null) {
      buf.append(percentOpacity.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -shadow (see ImageMagick-Documentation for details).
  */

  public IMOps shadow(Integer percentOpacity, Double sigma) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-shadow");

    if (percentOpacity != null) {
      buf.append(percentOpacity.toString());
    }
    buf.append("x");
    if (sigma != null) {
      buf.append(sigma.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -shadow (see ImageMagick-Documentation for details).
  */

  public IMOps shadow(Integer percentOpacity, Double sigma, Integer x) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-shadow");

    if (percentOpacity != null) {
      buf.append(percentOpacity.toString());
    }
    buf.append("x");
    if (sigma != null) {
      buf.append(sigma.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -shadow (see ImageMagick-Documentation for details).
  */

  public IMOps shadow(Integer percentOpacity, Double sigma, Integer x, Integer y) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-shadow");

    if (percentOpacity != null) {
      buf.append(percentOpacity.toString());
    }
    buf.append("x");
    if (sigma != null) {
      buf.append(sigma.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -shadow (see ImageMagick-Documentation for details).
  */

  public IMOps shadow(Integer percentOpacity, Double sigma, Integer x, Integer y, Boolean percent) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-shadow");

    if (percentOpacity != null) {
      buf.append(percentOpacity.toString());
    }
    buf.append("x");
    if (sigma != null) {
      buf.append(sigma.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
    }
    if (percent != null) {
      if (percent.booleanValue())
        buf.append("%");
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -shared-memory (see ImageMagick-Documentation for details).
  */

  public IMOps sharedMemory() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-shared-memory");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sharpen (see ImageMagick-Documentation for details).
  */

  public IMOps sharpen() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sharpen");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sharpen (see ImageMagick-Documentation for details).
  */

  public IMOps sharpen(Double radius) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sharpen");

    if (radius != null) {
      buf.append(radius.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sharpen (see ImageMagick-Documentation for details).
  */

  public IMOps sharpen(Double radius, Double sigma) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sharpen");

    if (radius != null) {
      buf.append(radius.toString());
    }
    buf.append("x");
    if (sigma != null) {
      buf.append(sigma.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -shave (see ImageMagick-Documentation for details).
  */

  public IMOps shave() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-shave");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -shave (see ImageMagick-Documentation for details).
  */

  public IMOps shave(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-shave");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -shave (see ImageMagick-Documentation for details).
  */

  public IMOps shave(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-shave");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -shave (see ImageMagick-Documentation for details).
  */

  public IMOps shave(Integer width, Integer height, Boolean percent) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-shave");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (percent != null) {
      if (percent.booleanValue())
        buf.append("%");
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -shear (see ImageMagick-Documentation for details).
  */

  public IMOps shear() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-shear");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -shear (see ImageMagick-Documentation for details).
  */

  public IMOps shear(Double xDegrees) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-shear");

    if (xDegrees != null) {
      buf.append(xDegrees.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -shear (see ImageMagick-Documentation for details).
  */

  public IMOps shear(Double xDegrees, Double yDegrees) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-shear");

    if (xDegrees != null) {
      buf.append(xDegrees.toString());
    }
    buf.append("x");
    if (yDegrees != null) {
      buf.append(yDegrees.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sigmoidal-contrast (see ImageMagick-Documentation for details).
  */

  public IMOps sigmoidalContrast() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sigmoidal-contrast");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sigmoidal-contrast (see ImageMagick-Documentation for details).
  */

  public IMOps sigmoidalContrast(Double contrast) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sigmoidal-contrast");

    if (contrast != null) {
      buf.append(contrast.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sigmoidal-contrast (see ImageMagick-Documentation for details).
  */

  public IMOps sigmoidalContrast(Double contrast, Double midPoint) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sigmoidal-contrast");

    if (contrast != null) {
      buf.append(contrast.toString());
    }
    buf.append("x");
    if (midPoint != null) {
      buf.append(midPoint.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +sigmoidal-contrast (see ImageMagick-Documentation for details).
  */

  public IMOps p_sigmoidalContrast() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+sigmoidal-contrast");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +sigmoidal-contrast (see ImageMagick-Documentation for details).
  */

  public IMOps p_sigmoidalContrast(Double contrast) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+sigmoidal-contrast");

    if (contrast != null) {
      buf.append(contrast.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +sigmoidal-contrast (see ImageMagick-Documentation for details).
  */

  public IMOps p_sigmoidalContrast(Double contrast, Double midPoint) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+sigmoidal-contrast");

    if (contrast != null) {
      buf.append(contrast.toString());
    }
    buf.append("x");
    if (midPoint != null) {
      buf.append(midPoint.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -silent (see ImageMagick-Documentation for details).
  */

  public IMOps silent() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-silent");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -size (see ImageMagick-Documentation for details).
  */

  public IMOps size() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-size");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -size (see ImageMagick-Documentation for details).
  */

  public IMOps size(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-size");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -size (see ImageMagick-Documentation for details).
  */

  public IMOps size(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-size");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -size (see ImageMagick-Documentation for details).
  */

  public IMOps size(Integer width, Integer height, Integer offset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-size");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (offset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (offset != null) {
      buf.append(offset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sketch (see ImageMagick-Documentation for details).
  */

  public IMOps sketch() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sketch");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sketch (see ImageMagick-Documentation for details).
  */

  public IMOps sketch(Double radius) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sketch");

    if (radius != null) {
      buf.append(radius.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sketch (see ImageMagick-Documentation for details).
  */

  public IMOps sketch(Double radius, Double sigma) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sketch");

    if (radius != null) {
      buf.append(radius.toString());
    }
    buf.append("x");
    if (sigma != null) {
      buf.append(sigma.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -sketch (see ImageMagick-Documentation for details).
  */

  public IMOps sketch(Double radius, Double sigma, Double angle) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-sketch");

    if (radius != null) {
      buf.append(radius.toString());
    }
    buf.append("x");
    if (sigma != null) {
      buf.append(sigma.toString());
    }
    oper="+";
    if (angle.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (angle != null) {
      buf.append(angle.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -snaps (see ImageMagick-Documentation for details).
  */

  public IMOps snaps() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-snaps");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -snaps (see ImageMagick-Documentation for details).
  */

  public IMOps snaps(Integer value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-snaps");

    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -solarize (see ImageMagick-Documentation for details).
  */

  public IMOps solarize() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-solarize");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -solarize (see ImageMagick-Documentation for details).
  */

  public IMOps solarize(Double threshold) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-solarize");

    if (threshold != null) {
      buf.append(threshold.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -splice (see ImageMagick-Documentation for details).
  */

  public IMOps splice() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-splice");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -splice (see ImageMagick-Documentation for details).
  */

  public IMOps splice(Double width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-splice");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -splice (see ImageMagick-Documentation for details).
  */

  public IMOps splice(Double width, Double height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-splice");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -splice (see ImageMagick-Documentation for details).
  */

  public IMOps splice(Double width, Double height, Double x) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-splice");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -splice (see ImageMagick-Documentation for details).
  */

  public IMOps splice(Double width, Double height, Double x, Double y) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-splice");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -splice (see ImageMagick-Documentation for details).
  */

  public IMOps splice(Double width, Double height, Double x, Double y, Boolean percent) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-splice");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
    }
    if (percent != null) {
      if (percent.booleanValue())
        buf.append("%");
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -spread (see ImageMagick-Documentation for details).
  */

  public IMOps spread() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-spread");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -spread (see ImageMagick-Documentation for details).
  */

  public IMOps spread(Integer amount) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-spread");

    if (amount != null) {
      buf.append(amount.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -stegano (see ImageMagick-Documentation for details).
  */

  public IMOps stegano() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-stegano");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -stegano (see ImageMagick-Documentation for details).
  */

  public IMOps stegano(Integer offset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-stegano");

    if (offset != null) {
      buf.append(offset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -stereo (see ImageMagick-Documentation for details).
  */

  public IMOps stereo() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-stereo");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -stereo (see ImageMagick-Documentation for details).
  */

  public IMOps stereo(Integer x) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-stereo");

    if (x != null) {
      buf.append(x.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -stereo (see ImageMagick-Documentation for details).
  */

  public IMOps stereo(Integer x, Integer y) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-stereo");

    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -storage-type (see ImageMagick-Documentation for details).
  */

  public IMOps storageType() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-storage-type");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -storage-type (see ImageMagick-Documentation for details).
  */

  public IMOps storageType(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-storage-type");

    if (type != null) {
      buf.append(type.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -strip (see ImageMagick-Documentation for details).
  */

  public IMOps strip() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-strip");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -stroke (see ImageMagick-Documentation for details).
  */

  public IMOps stroke() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-stroke");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -stroke (see ImageMagick-Documentation for details).
  */

  public IMOps stroke(String color) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-stroke");

    if (color != null) {
      buf.append(color.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -strokewidth (see ImageMagick-Documentation for details).
  */

  public IMOps strokewidth() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-strokewidth");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -strokewidth (see ImageMagick-Documentation for details).
  */

  public IMOps strokewidth(Integer value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-strokewidth");

    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +swap (see ImageMagick-Documentation for details).
  */

  public IMOps p_swap() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+swap");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -swap (see ImageMagick-Documentation for details).
  */

  public IMOps swap() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-swap");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -swap (see ImageMagick-Documentation for details).
  */

  public IMOps swap(Integer pos1) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-swap");

    if (pos1 != null) {
      buf.append(pos1.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -swap (see ImageMagick-Documentation for details).
  */

  public IMOps swap(Integer pos1, Integer pos2) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-swap");

    if (pos1 != null) {
      buf.append(pos1.toString());
    }
    buf.append(",");
    if (pos2 != null) {
      buf.append(pos2.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -swirl (see ImageMagick-Documentation for details).
  */

  public IMOps swirl() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-swirl");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -swirl (see ImageMagick-Documentation for details).
  */

  public IMOps swirl(Double degrees) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-swirl");

    if (degrees != null) {
      buf.append(degrees.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -taint (see ImageMagick-Documentation for details).
  */

  public IMOps taint() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-taint");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -text-font (see ImageMagick-Documentation for details).
  */

  public IMOps textFont() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-text-font");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -text-font (see ImageMagick-Documentation for details).
  */

  public IMOps textFont(String name) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-text-font");

    if (name != null) {
      buf.append(name.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -texture (see ImageMagick-Documentation for details).
  */

  public IMOps texture() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-texture");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -texture (see ImageMagick-Documentation for details).
  */

  public IMOps texture(String filename) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-texture");

    if (filename != null) {
      buf.append(filename.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -threshold (see ImageMagick-Documentation for details).
  */

  public IMOps threshold() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-threshold");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -threshold (see ImageMagick-Documentation for details).
  */

  public IMOps threshold(Integer red) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-threshold");

    if (red != null) {
      buf.append(red.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -threshold (see ImageMagick-Documentation for details).
  */

  public IMOps threshold(Integer red, Integer green) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-threshold");

    if (red != null) {
      buf.append(red.toString());
    }
    buf.append(",");
    if (green != null) {
      buf.append(green.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -threshold (see ImageMagick-Documentation for details).
  */

  public IMOps threshold(Integer red, Integer green, Integer blue) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-threshold");

    if (red != null) {
      buf.append(red.toString());
    }
    buf.append(",");
    if (green != null) {
      buf.append(green.toString());
    }
    buf.append(",");
    if (blue != null) {
      buf.append(blue.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -threshold (see ImageMagick-Documentation for details).
  */

  public IMOps threshold(Integer red, Integer green, Integer blue, Integer opacity) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-threshold");

    if (red != null) {
      buf.append(red.toString());
    }
    buf.append(",");
    if (green != null) {
      buf.append(green.toString());
    }
    buf.append(",");
    if (blue != null) {
      buf.append(blue.toString());
    }
    buf.append(",");
    if (opacity != null) {
      buf.append(opacity.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -threshold (see ImageMagick-Documentation for details).
  */

  public IMOps threshold(Integer red, Integer green, Integer blue, Integer opacity, Boolean percent) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-threshold");

    if (red != null) {
      buf.append(red.toString());
    }
    buf.append(",");
    if (green != null) {
      buf.append(green.toString());
    }
    buf.append(",");
    if (blue != null) {
      buf.append(blue.toString());
    }
    buf.append(",");
    if (opacity != null) {
      buf.append(opacity.toString());
    }
    if (percent != null) {
      if (percent.booleanValue())
        buf.append("%");
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -thumbnail (see ImageMagick-Documentation for details).
  */

  public IMOps thumbnail() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-thumbnail");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -thumbnail (see ImageMagick-Documentation for details).
  */

  public IMOps thumbnail(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-thumbnail");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -thumbnail (see ImageMagick-Documentation for details).
  */

  public IMOps thumbnail(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-thumbnail");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -thumbnail (see ImageMagick-Documentation for details).
  */

  public IMOps thumbnail(Integer width, Integer height, Character special) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-thumbnail");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (special != null) {
      buf.append(special.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -tile (see ImageMagick-Documentation for details).
  */

  public IMOps tile() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-tile");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -tile (see ImageMagick-Documentation for details).
  */

  public IMOps tile(Integer width) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-tile");

    if (width != null) {
      buf.append(width.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -tile (see ImageMagick-Documentation for details).
  */

  public IMOps tile(Integer width, Integer height) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-tile");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -tile (see ImageMagick-Documentation for details).
  */

  public IMOps tile(Integer width, Integer height, Integer xOffset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-tile");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (xOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (xOffset != null) {
      buf.append(xOffset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -tile (see ImageMagick-Documentation for details).
  */

  public IMOps tile(Integer width, Integer height, Integer xOffset, Integer yOffset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-tile");

    if (width != null) {
      buf.append(width.toString());
    }
    buf.append("x");
    if (height != null) {
      buf.append(height.toString());
    }
    oper="+";
    if (xOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (xOffset != null) {
      buf.append(xOffset.toString());
    }
    oper="+";
    if (yOffset.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (yOffset != null) {
      buf.append(yOffset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -tile-offset (see ImageMagick-Documentation for details).
  */

  public IMOps tileOffset() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-tile-offset");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -tile-offset (see ImageMagick-Documentation for details).
  */

  public IMOps tileOffset(Integer x) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-tile-offset");

    if (x != null) {
      buf.append(x.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -tile-offset (see ImageMagick-Documentation for details).
  */

  public IMOps tileOffset(Integer x, Integer y) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-tile-offset");

    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -tile (see ImageMagick-Documentation for details).
  */

  public IMOps tile(String filename) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-tile");

    if (filename != null) {
      buf.append(filename.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -tint (see ImageMagick-Documentation for details).
  */

  public IMOps tint() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-tint");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -tint (see ImageMagick-Documentation for details).
  */

  public IMOps tint(Double value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-tint");

    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -title (see ImageMagick-Documentation for details).
  */

  public IMOps title() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-title");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -title (see ImageMagick-Documentation for details).
  */

  public IMOps title(String text) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-title");

    if (text != null) {
      buf.append(text.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -transform (see ImageMagick-Documentation for details).
  */

  public IMOps transform() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-transform");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -transparent-color (see ImageMagick-Documentation for details).
  */

  public IMOps transparentColor() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-transparent-color");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -transparent-color (see ImageMagick-Documentation for details).
  */

  public IMOps transparentColor(String color) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-transparent-color");

    if (color != null) {
      buf.append(color.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -transparent (see ImageMagick-Documentation for details).
  */

  public IMOps transparent(String color) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-transparent");

    if (color != null) {
      buf.append(color.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -transpose (see ImageMagick-Documentation for details).
  */

  public IMOps transpose() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-transpose");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -transverse (see ImageMagick-Documentation for details).
  */

  public IMOps transverse() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-transverse");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -treedepth (see ImageMagick-Documentation for details).
  */

  public IMOps treedepth() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-treedepth");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -treedepth (see ImageMagick-Documentation for details).
  */

  public IMOps treedepth(Integer value) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-treedepth");

    if (value != null) {
      buf.append(value.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -trim (see ImageMagick-Documentation for details).
  */

  public IMOps trim() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-trim");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -type (see ImageMagick-Documentation for details).
  */

  public IMOps type() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-type");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -type (see ImageMagick-Documentation for details).
  */

  public IMOps type(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-type");

    if (type != null) {
      buf.append(type.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -undercolor (see ImageMagick-Documentation for details).
  */

  public IMOps undercolor() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-undercolor");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -undercolor (see ImageMagick-Documentation for details).
  */

  public IMOps undercolor(String color) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-undercolor");

    if (color != null) {
      buf.append(color.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -unique-colors (see ImageMagick-Documentation for details).
  */

  public IMOps uniqueColors() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-unique-colors");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -units (see ImageMagick-Documentation for details).
  */

  public IMOps units() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-units");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -units (see ImageMagick-Documentation for details).
  */

  public IMOps units(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-units");

    if (type != null) {
      buf.append(type.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -unsharp (see ImageMagick-Documentation for details).
  */

  public IMOps unsharp() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-unsharp");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -unsharp (see ImageMagick-Documentation for details).
  */

  public IMOps unsharp(Double radius) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-unsharp");

    if (radius != null) {
      buf.append(radius.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -unsharp (see ImageMagick-Documentation for details).
  */

  public IMOps unsharp(Double radius, Double sigma) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-unsharp");

    if (radius != null) {
      buf.append(radius.toString());
    }
    buf.append("x");
    if (sigma != null) {
      buf.append(sigma.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -unsharp (see ImageMagick-Documentation for details).
  */

  public IMOps unsharp(Double radius, Double sigma, Double amount) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-unsharp");

    if (radius != null) {
      buf.append(radius.toString());
    }
    buf.append("x");
    if (sigma != null) {
      buf.append(sigma.toString());
    }
    oper="+";
    if (amount.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (amount != null) {
      buf.append(amount.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -unsharp (see ImageMagick-Documentation for details).
  */

  public IMOps unsharp(Double radius, Double sigma, Double amount, Double threshold) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-unsharp");

    if (radius != null) {
      buf.append(radius.toString());
    }
    buf.append("x");
    if (sigma != null) {
      buf.append(sigma.toString());
    }
    oper="+";
    if (amount.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (amount != null) {
      buf.append(amount.toString());
    }
    oper="+";
    if (threshold.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (threshold != null) {
      buf.append(threshold.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -update (see ImageMagick-Documentation for details).
  */

  public IMOps update() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-update");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -update (see ImageMagick-Documentation for details).
  */

  public IMOps update(Integer seconds) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-update");

    if (seconds != null) {
      buf.append(seconds.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -verbose (see ImageMagick-Documentation for details).
  */

  public IMOps verbose() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-verbose");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -version (see ImageMagick-Documentation for details).
  */

  public IMOps version() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-version");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -view (see ImageMagick-Documentation for details).
  */

  public IMOps view() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-view");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -view (see ImageMagick-Documentation for details).
  */

  public IMOps view(String text) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-view");

    if (text != null) {
      buf.append(text.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -vignette (see ImageMagick-Documentation for details).
  */

  public IMOps vignette() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-vignette");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -vignette (see ImageMagick-Documentation for details).
  */

  public IMOps vignette(Double radius) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-vignette");

    if (radius != null) {
      buf.append(radius.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -vignette (see ImageMagick-Documentation for details).
  */

  public IMOps vignette(Double radius, Double sigma) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-vignette");

    if (radius != null) {
      buf.append(radius.toString());
    }
    buf.append("x");
    if (sigma != null) {
      buf.append(sigma.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -vignette (see ImageMagick-Documentation for details).
  */

  public IMOps vignette(Double radius, Double sigma, Double x) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-vignette");

    if (radius != null) {
      buf.append(radius.toString());
    }
    buf.append("x");
    if (sigma != null) {
      buf.append(sigma.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -vignette (see ImageMagick-Documentation for details).
  */

  public IMOps vignette(Double radius, Double sigma, Double x, Double y) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-vignette");

    if (radius != null) {
      buf.append(radius.toString());
    }
    buf.append("x");
    if (sigma != null) {
      buf.append(sigma.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -vignette (see ImageMagick-Documentation for details).
  */

  public IMOps vignette(Double radius, Double sigma, Double x, Double y, Boolean percent) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-vignette");

    if (radius != null) {
      buf.append(radius.toString());
    }
    buf.append("x");
    if (sigma != null) {
      buf.append(sigma.toString());
    }
    oper="+";
    if (x.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (x != null) {
      buf.append(x.toString());
    }
    oper="+";
    if (y.doubleValue() < 0)
      oper="";
    buf.append(oper);
    if (y != null) {
      buf.append(y.toString());
    }
    if (percent != null) {
      if (percent.booleanValue())
        buf.append("%");
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -virtual-pixel (see ImageMagick-Documentation for details).
  */

  public IMOps virtualPixel() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-virtual-pixel");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -virtual-pixel (see ImageMagick-Documentation for details).
  */

  public IMOps virtualPixel(String method) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-virtual-pixel");

    if (method != null) {
      buf.append(method.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -visual (see ImageMagick-Documentation for details).
  */

  public IMOps visual() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-visual");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -visual (see ImageMagick-Documentation for details).
  */

  public IMOps visual(String type) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-visual");

    if (type != null) {
      buf.append(type.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -watermark (see ImageMagick-Documentation for details).
  */

  public IMOps watermark() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-watermark");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -watermark (see ImageMagick-Documentation for details).
  */

  public IMOps watermark(Double brightness) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-watermark");

    if (brightness != null) {
      buf.append(brightness.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -wave (see ImageMagick-Documentation for details).
  */

  public IMOps wave() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-wave");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -wave (see ImageMagick-Documentation for details).
  */

  public IMOps wave(Double amplitude) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-wave");

    if (amplitude != null) {
      buf.append(amplitude.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -wave (see ImageMagick-Documentation for details).
  */

  public IMOps wave(Double amplitude, Double wavelength) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-wave");

    if (amplitude != null) {
      buf.append(amplitude.toString());
    }
    buf.append("x");
    if (wavelength != null) {
      buf.append(wavelength.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -white-point (see ImageMagick-Documentation for details).
  */

  public IMOps whitePoint() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-white-point");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -white-point (see ImageMagick-Documentation for details).
  */

  public IMOps whitePoint(Double x) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-white-point");

    if (x != null) {
      buf.append(x.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -white-point (see ImageMagick-Documentation for details).
  */

  public IMOps whitePoint(Double x, Double y) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-white-point");

    if (x != null) {
      buf.append(x.toString());
    }
    buf.append(",");
    if (y != null) {
      buf.append(y.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -white-threshold (see ImageMagick-Documentation for details).
  */

  public IMOps whiteThreshold() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-white-threshold");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -white-threshold (see ImageMagick-Documentation for details).
  */

  public IMOps whiteThreshold(Double threshold) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-white-threshold");

    if (threshold != null) {
      buf.append(threshold.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -window-group (see ImageMagick-Documentation for details).
  */

  public IMOps windowGroup() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-window-group");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -window (see ImageMagick-Documentation for details).
  */

  public IMOps window(String id) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-window");

    if (id != null) {
      buf.append(id.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -write (see ImageMagick-Documentation for details).
  */

  public IMOps write() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-write");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     -write (see ImageMagick-Documentation for details).
  */

  public IMOps write(String filename) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("-write");

    if (filename != null) {
      buf.append(filename.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +write (see ImageMagick-Documentation for details).
  */

  public IMOps p_write() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+write");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     +write (see ImageMagick-Documentation for details).
  */

  public IMOps p_write(String filename) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args

    iCmdArgs.add("+write");

    if (filename != null) {
      buf.append(filename.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }


}
