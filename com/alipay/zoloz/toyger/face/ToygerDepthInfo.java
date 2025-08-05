package com.alipay.zoloz.toyger.face;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes3.dex */
public class ToygerDepthInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public byte[] depthInfo = null;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23, types: [int] */
    public void depthBlobInfo(byte[] bArr) {
        StringBuilder sb;
        int length;
        StringBuilder sb2;
        int i = "使用GZIP压缩，关闭execption";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18728edc", new Object[]{this, bArr});
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = null;
        try {
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream2.write(bArr);
                    try {
                        try {
                            gZIPOutputStream2.close();
                            this.depthInfo = byteArrayOutputStream.toByteArray();
                            sb2 = new StringBuilder();
                            sb2.append("depthInfo after gzip size ");
                            i = this.depthInfo.length;
                        } finally {
                        }
                    } catch (IOException unused) {
                        Log.e("ToygerDepthInfo", i);
                        this.depthInfo = byteArrayOutputStream.toByteArray();
                        sb2 = new StringBuilder();
                        sb2.append("depthInfo after gzip size ");
                        i = this.depthInfo.length;
                    }
                } catch (IOException unused2) {
                    gZIPOutputStream = gZIPOutputStream2;
                    Log.e("ToygerDepthInfo", "使用gzip 压缩 execption");
                    try {
                        if (gZIPOutputStream == null) {
                            return;
                        }
                        try {
                            gZIPOutputStream.close();
                            this.depthInfo = byteArrayOutputStream.toByteArray();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("depthInfo after gzip size ");
                            i = this.depthInfo.length;
                            sb2 = sb3;
                        } catch (IOException unused3) {
                            Log.e("ToygerDepthInfo", i);
                            this.depthInfo = byteArrayOutputStream.toByteArray();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("depthInfo after gzip size ");
                            i = this.depthInfo.length;
                            sb2 = sb4;
                        }
                        sb2.append((int) i);
                        sb2.toString();
                    } finally {
                    }
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    if (gZIPOutputStream != null) {
                        try {
                            try {
                                gZIPOutputStream.close();
                                this.depthInfo = byteArrayOutputStream.toByteArray();
                                sb = new StringBuilder();
                                sb.append("depthInfo after gzip size ");
                                length = this.depthInfo.length;
                            } finally {
                            }
                        } catch (IOException unused4) {
                            Log.e("ToygerDepthInfo", i);
                            this.depthInfo = byteArrayOutputStream.toByteArray();
                            sb = new StringBuilder();
                            sb.append("depthInfo after gzip size ");
                            length = this.depthInfo.length;
                            sb.append(length);
                            sb.toString();
                            throw th;
                        }
                        sb.append(length);
                        sb.toString();
                    }
                    throw th;
                }
            } catch (IOException unused5) {
            }
            sb2.append((int) i);
            sb2.toString();
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
