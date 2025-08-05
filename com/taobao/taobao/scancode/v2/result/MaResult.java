package com.taobao.taobao.scancode.v2.result;

import java.io.Serializable;
import java.util.Arrays;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MaResult implements Serializable, IMTOPDataObject {
    private int height;
    private String text;
    private MaType type;
    private int width;
    private int x;
    private int[] xCorner;
    private int y;
    private int[] yCorner;

    static {
        kge.a(174697319);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    public MaResult() {
    }

    public MaResult(MaType maType, String str) {
        this.type = maType;
        this.text = str;
    }

    public MaResult(MaType maType, String str, int[] iArr, int[] iArr2, int i, int i2, int i3, int i4) {
        this.type = maType;
        this.text = str;
        this.xCorner = iArr;
        this.yCorner = iArr2;
        this.x = i;
        this.y = i2;
        this.width = i3;
        this.height = i4;
    }

    public MaResult(a aVar) {
        this(aVar.f, aVar.c, aVar.k, aVar.l, aVar.g, aVar.h, aVar.i, aVar.j);
    }

    public MaType getType() {
        return this.type;
    }

    public String getText() {
        return this.text;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int i) {
        this.x = i;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int i) {
        this.y = i;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public int[] getXCorner() {
        return this.xCorner;
    }

    public void setXCorner(int[] iArr) {
        this.xCorner = iArr;
    }

    public int[] getYCorner() {
        return this.yCorner;
    }

    public void setYCorner(int[] iArr) {
        this.yCorner = iArr;
    }

    public void setType(MaType maType) {
        this.type = maType;
    }

    public void setText(String str) {
        this.text = str;
    }

    public int[] getxCorner() {
        return this.xCorner;
    }

    public void setxCorner(int[] iArr) {
        this.xCorner = iArr;
    }

    public int[] getyCorner() {
        return this.yCorner;
    }

    public void setyCorner(int[] iArr) {
        this.yCorner = iArr;
    }

    public String toString() {
        return "MaResult{type=" + this.type + ", text='" + this.text + "', x=" + this.x + ", y=" + this.y + ", width=" + this.width + ", height=" + this.height + ", xCorner=" + Arrays.toString(this.xCorner) + ", yCorner=" + Arrays.toString(this.yCorner) + '}';
    }
}
