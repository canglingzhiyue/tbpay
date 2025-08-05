package com.alibaba.ariver.kernel.common.utils;

import android.content.res.Resources;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.io.ByteArrayPool;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import tb.kge;

/* loaded from: classes2.dex */
public class IOUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAP_FILE_THRESHOLD_MIN = 65536;
    public static final int MAP_FILE_THRESHOOLD_MAX = 5242880;

    /* renamed from: a  reason: collision with root package name */
    private static final ByteArrayPool f2909a;

    static {
        kge.a(1448927320);
        f2909a = new ByteArrayPool(20480);
    }

    public static ByteArrayPool getByteArrayPool() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteArrayPool) ipChange.ipc$dispatch("f43f1d56", new Object[0]) : f2909a;
    }

    public static byte[] getBuf(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("a0197a7e", new Object[]{new Integer(i)}) : getByteArrayPool().getBuf(i);
    }

    public static void returnBuf(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15524871", new Object[]{bArr});
        } else {
            getByteArrayPool().returnBuf(bArr);
        }
    }

    public static boolean isNIOEnabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("258c3c62", new Object[0])).booleanValue() : Constants.VAL_YES.equalsIgnoreCase(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigWithProcessCache("h5_nebulaUseNIO", "no"));
    }

    public static void freeMappedBuffer(MappedByteBuffer mappedByteBuffer) {
        if (mappedByteBuffer == null) {
            return;
        }
        try {
            Method declaredMethod = Class.forName("java.nio.NioUtils").getDeclaredMethod("freeDirectBuffer", ByteBuffer.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, mappedByteBuffer);
        } catch (Throwable th) {
            RVLogger.e("AriverKernel", "freeMappedBuffer Exception!", th);
        }
    }

    public static void closeQuietly(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61d37bb", new Object[]{closeable});
        } else if (closeable == null) {
        } else {
            try {
                closeable.close();
            } catch (IOException e) {
                RVLogger.e("close stream exception", e);
            }
        }
    }

    public static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad894149", new Object[]{inputStream, outputStream});
        } else {
            copy(inputStream, outputStream, 4096);
        }
    }

    public static void copy(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f5ada", new Object[]{inputStream, outputStream, new Integer(i)});
            return;
        }
        byte[] buf = getBuf(i);
        while (true) {
            int read = inputStream.read(buf);
            if (-1 == read) {
                return;
            }
            outputStream.write(buf, 0, read);
        }
    }

    public static byte[] readToByte(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("e0ed5c0a", new Object[]{inputStream});
        }
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, bArr.length);
                if (read >= 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            } catch (Exception e) {
                RVLogger.e("read exception", e);
                return null;
            } finally {
                closeQuietly(inputStream);
            }
        }
    }

    public static String read(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3b2827ca", new Object[]{inputStream});
        }
        if (inputStream != null) {
            return new String(readToByte(inputStream));
        }
        return null;
    }

    public static String read(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a0eb7d9", new Object[]{str});
        }
        try {
            return read(new FileInputStream(str));
        } catch (Exception e) {
            RVLogger.e("read exception", e);
            return null;
        }
    }

    public static String readAsset(Resources resources, String str) {
        InputStream inputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ef52956", new Object[]{resources, str});
        }
        try {
            inputStream = AssetsDelegate.proxy_open(resources.getAssets(), str);
        } catch (IOException e) {
            e = e;
            inputStream = null;
        } catch (Throwable th) {
            th = th;
            inputStream = null;
            closeQuietly(inputStream);
            throw th;
        }
        try {
            try {
                String read = read(inputStream);
                closeQuietly(inputStream);
                return read;
            } catch (Throwable th2) {
                th = th2;
                closeQuietly(inputStream);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            RVLogger.e("read asset exception", e);
            closeQuietly(inputStream);
            return null;
        }
    }

    public static void write(String str, String str2, boolean z) throws IOException {
        BufferedWriter bufferedWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5216831a", new Object[]{str, str2, new Boolean(z)});
            return;
        }
        File file = new File(str);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException unused) {
            }
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, z)));
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(str2);
            try {
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (IOException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.flush();
                    bufferedWriter2.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }
}
