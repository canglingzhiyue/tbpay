package com.taobao.livephoto.watermask;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.marvel.Exporter;
import com.alibaba.marvel.Marvel;
import com.alibaba.marvel.MeEditor;
import com.alibaba.marvel.Project;
import com.alibaba.marvel.exporter.ImageExporter;
import com.alibaba.marvel.exporter.MediaExporter;
import com.alibaba.marvel.java.AudioConfiguration;
import com.alibaba.marvel.java.OnCompleteListener;
import com.alibaba.marvel.java.OnErrorListener;
import com.alibaba.marvel.java.OnProgressListener;
import com.alibaba.marvel.java.VideoConfiguration;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import tb.keu;
import tb.kge;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f17813a;
    private final List<Exporter> b = new ArrayList();
    private final Handler c = new Handler(Looper.getMainLooper());

    static {
        kge.a(-1369570816);
    }

    public static /* synthetic */ boolean a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c41047c0", new Object[]{cVar})).booleanValue() : cVar.c();
    }

    public static /* synthetic */ Context b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e07fb6f5", new Object[]{cVar}) : cVar.f17813a;
    }

    public static /* synthetic */ Handler c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("3deba3c8", new Object[]{cVar}) : cVar.c;
    }

    public c(Context context) {
        this.f17813a = context;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f17813a = null;
        for (Exporter exporter : this.b) {
            exporter.cancel();
        }
    }

    public synchronized void a(String str, String str2, int i, int i2, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ee48d1", new Object[]{this, str, str2, new Integer(i), new Integer(i2), bVar});
            return;
        }
        AdapterForTLog.loge("VideoWaterMask", "doImageExport,imagePath:" + str + ", width:" + i + ", height:" + i2);
        if (c() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Project b = b();
            b.getMeEditor().setCanvasSize(i, i2);
            a(b.getMeEditor(), str, str2);
            Exporter a2 = a(i, i2);
            this.b.add(a2);
            a2.setBitmapListener(new ImageExporter.a() { // from class: com.taobao.livephoto.watermask.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void a(long j, int i3, int i4, int i5, int i6, ByteBuffer byteBuffer) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e290dcb5", new Object[]{this, new Long(j), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), byteBuffer});
                        return;
                    }
                    AdapterForTLog.loge("VideoWaterMask", "onFrame, width = " + i5 + ", height = " + i6);
                    if (!c.a(c.this)) {
                        bVar.d("context is invalid in callback");
                        return;
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(byteBuffer);
                    final String a3 = a.a(c.b(c.this), createBitmap);
                    c.c(c.this).post(new Runnable() { // from class: com.taobao.livephoto.watermask.c.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                bVar.c(a3);
                            }
                        }
                    });
                }
            });
            b.export(a2);
            return;
        }
        bVar.d("params is invalid, imagePath = " + str + ", mediaWidth = " + i + ", mediaHeight = " + i2);
    }

    public synchronized void a(String str, String str2, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dec1af71", new Object[]{this, str, str2, bVar});
            return;
        }
        AdapterForTLog.loge("VideoWaterMask", "doVideoExport, videoPath = " + str + ", waterMaskPath = " + str2);
        if (c() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Project b = b();
            String createResourceIfNeeded = b.getMeEditor().createResourceIfNeeded(str, "resMedia");
            int resWidth = b.getMeEditor().getResWidth(createResourceIfNeeded);
            int resHeight = b.getMeEditor().getResHeight(createResourceIfNeeded);
            b.getMeEditor().setCanvasSize(resWidth, resHeight);
            b(b.getMeEditor(), str, str2);
            String str3 = this.f17813a.getFilesDir().getPath() + File.separator + Login.getUserId() + "_" + System.currentTimeMillis() + keu.SUFFIX_MP4;
            Exporter a2 = a(str3, resWidth, resHeight);
            this.b.add(a2);
            a(a2, str3, bVar);
            b.export(a2);
        }
    }

    private Project b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Project) ipChange.ipc$dispatch("e2cd7472", new Object[]{this});
        }
        if (!Marvel.isInit()) {
            Marvel.initSDK(Globals.getApplication());
        }
        return Marvel.createProject();
    }

    private void a(MeEditor meEditor, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa5aca59", new Object[]{this, meEditor, str, str2});
            return;
        }
        String addMainClip = meEditor.addMainClip(str, 0L, -1L);
        AdapterForTLog.loge("VideoWaterMask", "clipId = " + addMainClip);
        String addPipClip = meEditor.addPipClip("", str2, 0L, 0L, -1L);
        meEditor.setScale(addPipClip, 0.321f);
        meEditor.setPosition(addPipClip, 0.473f, 0.466f);
        meEditor.setAnchor(addPipClip, 0.5f, 0.5f);
    }

    private void b(MeEditor meEditor, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33b2af8", new Object[]{this, meEditor, str, str2});
            return;
        }
        String addStickerClip = meEditor.addStickerClip("", str2, 0L, meEditor.getClipEndTimeUs(meEditor.addMainClip(str, 0L, -1L)));
        meEditor.setScale(addStickerClip, 0.321f);
        meEditor.setPosition(addStickerClip, 0.473f, 0.466f);
        meEditor.setAnchor(addStickerClip, 0.5f, 0.5f);
    }

    private void a(Exporter exporter, final String str, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e96d5c8", new Object[]{this, exporter, str, bVar});
        } else if (bVar == null) {
        } else {
            exporter.setOnErrorListener(new OnErrorListener() { // from class: com.taobao.livephoto.watermask.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void onError(String str2, String str3, int i, final String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9c8c7f09", new Object[]{this, str2, str3, new Integer(i), str4});
                        return;
                    }
                    AdapterForTLog.loge("VideoWaterMask", "errorInfo " + str4);
                    c.c(c.this).post(new Runnable() { // from class: com.taobao.livephoto.watermask.c.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (!c.a(c.this)) {
                            } else {
                                Toast.makeText(c.b(c.this), c.b(c.this).getString(R.string.save_fail), 1).show();
                                bVar.d(str4);
                            }
                        }
                    });
                }
            });
            exporter.setOnProgressListener(new OnProgressListener() { // from class: com.taobao.livephoto.watermask.c.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void onProgress(final float f) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5ec8ea6d", new Object[]{this, new Float(f)});
                        return;
                    }
                    AdapterForTLog.loge("VideoWaterMask", "progress = " + f);
                    c.c(c.this).post(new Runnable() { // from class: com.taobao.livephoto.watermask.c.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                bVar.a((int) (f * 100.0f));
                            }
                        }
                    });
                }
            });
            exporter.setOnCompleteListener(new OnCompleteListener() { // from class: com.taobao.livephoto.watermask.c.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void onComplete() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                        return;
                    }
                    final String a2 = a.a(c.b(c.this), str);
                    AdapterForTLog.loge("VideoWaterMask", "onComplete, outputPath = " + a2);
                    c.c(c.this).post(new Runnable() { // from class: com.taobao.livephoto.watermask.c.4.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (!c.a(c.this)) {
                            } else {
                                Toast.makeText(c.b(c.this), c.b(c.this).getString(R.string.save_success), 1).show();
                                bVar.c(a2);
                            }
                        }
                    });
                }
            });
        }
    }

    private ImageExporter a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageExporter) ipChange.ipc$dispatch("7032e07c", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        ImageExporter imageExporter = new ImageExporter();
        imageExporter.setWidth(i);
        imageExporter.setHeight(i2);
        return imageExporter;
    }

    private MediaExporter a(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaExporter) ipChange.ipc$dispatch("3c4b3cdd", new Object[]{this, str, new Integer(i), new Integer(i2)});
        }
        return new MediaExporter.Builder().setAudioConfig(new AudioConfiguration.Builder().setBps(131072).setFrequency(44100).setChannel(AudioConfiguration.ChannelType.CHANNEL_IN_STEREO).build()).setVideoConfig(new VideoConfiguration.Builder().setFps(23).setSize(i, i2).setBps(3200).build()).setOutputPath(str).setSyncPrepare(true).build();
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        Context context = this.f17813a;
        return context != null && (context instanceof Activity) && !((Activity) context).isFinishing();
    }
}
