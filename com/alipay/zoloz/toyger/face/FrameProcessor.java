package com.alipay.zoloz.toyger.face;

import android.graphics.Bitmap;
import android.util.Log;
import com.alipay.zoloz.toyger.algorithm.TGDepthFrame;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public class FrameProcessor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final SimpleDateFormat DATE_FORMAT2 = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss-SSS", Locale.US);

    /* renamed from: a  reason: collision with root package name */
    private TGFrame f6278a;
    private TGDepthFrame b;

    /* loaded from: classes3.dex */
    public static class LogFileNameFilter implements FilenameFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6696dd14", new Object[]{this, file, str})).booleanValue() : str.endsWith(".bin");
        }
    }

    public static String getDetailDateFormat(long j) {
        String format;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("69643a0f", new Object[]{new Long(j)});
        }
        synchronized (DATE_FORMAT2) {
            format = DATE_FORMAT2.format(new Date(j));
        }
        return format;
    }

    public TGFrame getTgFrame() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TGFrame) ipChange.ipc$dispatch("71a58c57", new Object[]{this}) : this.f6278a;
    }

    public TGDepthFrame getTgDepthFrame() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TGDepthFrame) ipChange.ipc$dispatch("321b5339", new Object[]{this}) : this.b;
    }

    public static void bitmap2File(Bitmap bitmap, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b17be5f", new Object[]{bitmap, file});
            return;
        }
        if (file.exists()) {
            file.delete();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException | IOException unused) {
        }
    }

    public static synchronized boolean save(File file, byte[] bArr) {
        FileOutputStream fileOutputStream;
        synchronized (FrameProcessor.class) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c8cbb406", new Object[]{file, bArr})).booleanValue();
            }
            if (file != null && bArr != null) {
                if (file.exists()) {
                    file.delete();
                } else {
                    try {
                        file.createNewFile();
                    } catch (IOException unused) {
                    }
                }
                BufferedOutputStream bufferedOutputStream = null;
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                        try {
                            bufferedOutputStream2.write(bArr);
                            bufferedOutputStream2.flush();
                            close(bufferedOutputStream2);
                            close(fileOutputStream);
                        } catch (IOException unused2) {
                            bufferedOutputStream = bufferedOutputStream2;
                            close(bufferedOutputStream);
                            close(fileOutputStream);
                            z = false;
                            return z;
                        } catch (Throwable th) {
                            th = th;
                            bufferedOutputStream = bufferedOutputStream2;
                            close(bufferedOutputStream);
                            close(fileOutputStream);
                            throw th;
                        }
                    } catch (IOException unused3) {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException unused4) {
                    fileOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
                return z;
            }
            z = false;
            return z;
        }
    }

    public static void close(OutputStream outputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72a12b31", new Object[]{outputStream});
        } else if (outputStream == null) {
        } else {
            try {
                outputStream.close();
            } catch (IOException e) {
                Log.e("FrameProcessor", e.toString());
            }
        }
    }
}
