package com.alibaba.security.wukong.model.meta;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class ByteImage extends Image {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public byte[] data;
    public int format;
    public int height;
    public int width;

    public ByteImage(byte[] bArr, int i, int i2, int i3) {
        super(System.currentTimeMillis());
        this.data = bArr;
        this.width = i;
        this.height = i2;
        this.format = i3;
    }

    public byte[] getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("e6eec916", new Object[]{this}) : this.data;
    }

    public int getFormat() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("17b60e7", new Object[]{this})).intValue() : this.format;
    }

    public int getHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue() : this.height;
    }

    @Override // com.alibaba.security.wukong.model.meta.Data
    public Map<String, Object> getRawMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("49177706", new Object[]{this});
        }
        return null;
    }

    public int getWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue() : this.width;
    }

    @Override // com.alibaba.security.wukong.model.meta.Data
    public int length() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("451fdc60", new Object[]{this})).intValue();
        }
        byte[] bArr = this.data;
        if (bArr != null) {
            return bArr.length;
        }
        return 0;
    }

    public void setData(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252501ba", new Object[]{this, bArr});
        } else {
            this.data = bArr;
        }
    }

    public void setFormat(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c456a403", new Object[]{this, new Integer(i)});
        } else {
            this.format = i;
        }
    }

    public void setHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fde48d3", new Object[]{this, new Integer(i)});
        } else {
            this.height = i;
        }
    }

    public void setWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf60358", new Object[]{this, new Integer(i)});
        } else {
            this.width = i;
        }
    }

    public ByteImage(byte[] bArr, int i, int i2, int i3, long j) {
        super(j);
        this.data = bArr;
        this.width = i;
        this.height = i2;
        this.format = i3;
    }
}
