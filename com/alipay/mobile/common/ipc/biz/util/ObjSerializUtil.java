package com.alipay.mobile.common.ipc.biz.util;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class ObjSerializUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final byte[] serializ(Serializable serializable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d6fd19d", new Object[]{serializable});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        try {
            objectOutputStream.writeObject(serializable);
            objectOutputStream.flush();
            byteArrayOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } finally {
            try {
                byteArrayOutputStream.close();
                objectOutputStream.close();
            } catch (Exception e) {
                LogCatUtil.warn("ObjSerializUtil", "serializ exception: " + e.toString());
            }
        }
    }

    public static final Serializable deserializ(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Serializable) ipChange.ipc$dispatch("755c63b6", new Object[]{bArr});
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        try {
            return (Serializable) objectInputStream.readObject();
        } finally {
            try {
                byteArrayInputStream.close();
                objectInputStream.close();
            } catch (Exception e) {
                LogCatUtil.warn("ObjSerializUtil", "deserializ exception: " + e.toString());
            }
        }
    }

    public static final Serializable deserializ(byte[] bArr, ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Serializable) ipChange.ipc$dispatch("df7e674", new Object[]{bArr, classLoader});
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        CustomCLObjectInputStream customCLObjectInputStream = new CustomCLObjectInputStream(byteArrayInputStream, classLoader);
        try {
            return (Serializable) customCLObjectInputStream.readObject();
        } finally {
            try {
                byteArrayInputStream.close();
                customCLObjectInputStream.close();
            } catch (Exception e) {
                LogCatUtil.warn("ObjSerializUtil", "deserializ2 exception: " + e.toString());
            }
        }
    }
}
