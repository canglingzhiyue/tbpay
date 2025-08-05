package android.taobao.windvane.cache;

import android.taobao.windvane.util.m;
import com.android.alibaba.ip.runtime.IpChange;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import tb.kge;

/* loaded from: classes2.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DEFAULT_MAX_AGE = 2592000000L;
    public static final int FILE_INFO_MIN_LEN = 60;
    public static final long S_MAX_AGE = 300000;

    static {
        kge.a(-1906417287);
    }

    public static c a(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("7731cd6e", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        try {
            return a(new String(bArr, i, i2, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static c a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("668b15d1", new Object[]{str});
        }
        if (str.length() > 60 && str.charAt(13) == '~' && str.charAt(27) == '~' && str.charAt(60) == '~') {
            c cVar = new c();
            String[] split = str.split(Constants.WAVE_SEPARATOR);
            if (7 != split.length) {
                return null;
            }
            try {
                cVar.f1551a = Long.parseLong(split[0]);
                try {
                    cVar.b = Long.parseLong(split[1]);
                    cVar.c = split[2];
                    cVar.e = split[3];
                    cVar.d = split[4];
                    cVar.f = split[5];
                    cVar.g = split[6];
                    return cVar;
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    return null;
                }
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public static c a(int i, c cVar, FileChannel fileChannel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("e526053c", new Object[]{new Integer(i), cVar, fileChannel});
        }
        if (m.a()) {
            m.b("FileInfoParser", "updateFileInfo filename:" + cVar.c + "operation:" + i);
        }
        if (i == 1) {
            a(cVar, fileChannel);
        } else if (i == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            if (cVar.f1551a == 0) {
                cVar.f1551a = currentTimeMillis + 300000;
            }
            a(cVar, fileChannel);
        } else if (i == 3) {
            cVar.i = false;
            a(cVar, fileChannel);
        } else if (i == 4) {
            long currentTimeMillis2 = System.currentTimeMillis();
            if (cVar.f1551a == 0) {
                cVar.f1551a = currentTimeMillis2 + 300000;
            }
            try {
                cVar.h = fileChannel.size();
            } catch (IOException e) {
                m.e("FileInfoParser", "updateFileInfo setPos error:" + cVar.c + ". fChannel.size():" + e.getMessage());
            }
            a(cVar, fileChannel);
        }
        return cVar;
    }

    private static void a(c cVar, FileChannel fileChannel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321f986a", new Object[]{cVar, fileChannel});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        byte[] b = cVar.b();
        if (b == null) {
            return;
        }
        ByteBuffer allocate = ByteBuffer.allocate(b.length + 1);
        allocate.put(b);
        allocate.put((byte) 10);
        allocate.position(0);
        try {
            fileChannel.write(allocate, cVar.h);
        } catch (IOException e) {
            m.e("FileInfoParser", "refreshFileInfo: write error. " + e.getMessage());
        }
        if (!m.a()) {
            return;
        }
        m.b("FileInfoParser", "refreshFileInfo time cost:" + (System.currentTimeMillis() - currentTimeMillis));
    }
}
