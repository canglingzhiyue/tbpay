package com.taobao.tao.adapter.biz.plugins.watermask;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.marvel.Marvel;
import com.alibaba.marvel.MeEditor;
import com.alibaba.marvel.Project;
import com.alibaba.marvel.exporter.MediaExporter;
import com.alibaba.marvel.java.AudioConfiguration;
import com.alibaba.marvel.java.OnCompleteListener;
import com.alibaba.marvel.java.OnErrorListener;
import com.alibaba.marvel.java.OnProgressListener;
import com.alibaba.marvel.java.VideoConfiguration;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.Map;
import tb.kge;
import tb.ocv;
import tb.ocw;
import tb.ocx;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Handler f19821a = new Handler(Looper.getMainLooper());
    private MediaExporter b;
    private Project c;

    static {
        kge.a(-888937212);
    }

    public static /* synthetic */ Handler a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("1118e0ba", new Object[]{bVar}) : bVar.f19821a;
    }

    public synchronized void a(Context context, String str, String str2, Bitmap bitmap, String str3, String str4, Map<String, String> map, boolean z, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("711b9302", new Object[]{this, context, str, str2, bitmap, str3, str4, map, new Boolean(z), aVar});
            return;
        }
        if (!Marvel.isInit()) {
            Marvel.initSDK(Globals.getApplication());
        }
        this.c = Marvel.createProject();
        String createResourceIfNeeded = this.c.getMeEditor().createResourceIfNeeded(str, "resMedia");
        int resWidth = this.c.getMeEditor().getResWidth(createResourceIfNeeded);
        int resHeight = this.c.getMeEditor().getResHeight(createResourceIfNeeded);
        this.c.getMeEditor().setCanvasSize(resWidth, resHeight);
        a(context, str, str2, bitmap, str3, str4, map, z, resWidth, resHeight, this.c.getMeEditor());
        a(this.c, context, str2, resWidth, resHeight, aVar);
    }

    private void a(Context context, String str, String str2, Bitmap bitmap, String str3, String str4, Map<String, String> map, boolean z, int i, int i2, MeEditor meEditor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cd753f0", new Object[]{this, context, str, str2, bitmap, str3, str4, map, new Boolean(z), new Integer(i), new Integer(i2), meEditor});
            return;
        }
        String addMainClip = meEditor.addMainClip(str, 0L, -1L);
        long clipEndTimeUs = meEditor.getClipEndTimeUs(addMainClip);
        int a2 = ocw.a(i, i2);
        String addStickerClip = meEditor.addStickerClip("", c.a(context, str2, str4, z), 0L, clipEndTimeUs);
        meEditor.setScale(addStickerClip, ocv.a(a2, map.get(com.taobao.tao.adapter.biz.plugins.a.RATIO_SCALE_MAP_KEY)));
        float[] b = ocv.b(a2, map.get(com.taobao.tao.adapter.biz.plugins.a.RATIO_POSITION_MAP_KEY));
        float[] c = ocv.c(a2, map.get(com.taobao.tao.adapter.biz.plugins.a.RATIO_ANCHOR_MAP_KEY));
        meEditor.setPosition(addStickerClip, b[0], b[1]);
        meEditor.setAnchor(addStickerClip, c[0], c[1]);
        if (z) {
            return;
        }
        meEditor.addMainClip(c.a(context, str2, i, i2), 0L, 2000000L);
        meEditor.setTransitionEffect(addMainClip, str4 + "/" + c.DIR_NAME + "/material.json", "overlay");
        meEditor.setTransitionDurationUs(addMainClip, 400000L);
        String addStickerClip2 = meEditor.addStickerClip("", c.a(context, str2, bitmap), clipEndTimeUs, 2000000L);
        meEditor.setPosition(addStickerClip2, 0.0f, ocv.a(a2));
        meEditor.setScale(addStickerClip2, ocv.c(a2));
        String addStickerClip3 = meEditor.addStickerClip("", c.a(context, str2, str3, str4), clipEndTimeUs, 2000000L);
        meEditor.setAnchor(addStickerClip3, 0.0f, 0.5f);
        meEditor.setPosition(addStickerClip3, 0.0f, ocv.b(a2));
        meEditor.setScale(addStickerClip3, ocv.d(a2));
        String addStickerClip4 = meEditor.addStickerClip("", str4 + "/" + c.DIR_NAME + "/bottom_logo.png", clipEndTimeUs, 2000000L);
        meEditor.setAnchor(addStickerClip4, 0.0f, 0.5f);
        meEditor.setPosition(addStickerClip4, 0.0f, ocv.e(a2));
        meEditor.setScale(addStickerClip4, ocv.f(a2));
        String addStickerClip5 = meEditor.addStickerClip("", str4 + "/" + c.DIR_NAME + "/icon.png", clipEndTimeUs, 2000000L);
        meEditor.setAnchor(addStickerClip5, 0.0f, 0.5f);
        meEditor.setPosition(addStickerClip5, 0.0f, ocv.h(a2));
        meEditor.setScale(addStickerClip5, ocv.g(a2));
    }

    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.b != null) {
            this.b.cancel();
        }
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.c != null) {
            this.c.destroy();
        }
    }

    private void a(Project project, Context context, String str, int i, int i2, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c29b7ca", new Object[]{this, project, context, str, new Integer(i), new Integer(i2), aVar});
            return;
        }
        final String a2 = ocx.a(context, str);
        this.b = a(a2, i, i2);
        this.b.setOnErrorListener(new OnErrorListener() { // from class: com.taobao.tao.adapter.biz.plugins.watermask.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void onError(String str2, String str3, int i3, final String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9c8c7f09", new Object[]{this, str2, str3, new Integer(i3), str4});
                    return;
                }
                String str5 = "errorInfo " + str4;
                b.a(b.this).post(new Runnable() { // from class: com.taobao.tao.adapter.biz.plugins.watermask.b.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            aVar.b(str4);
                        }
                    }
                });
            }
        });
        this.b.setOnCompleteListener(new OnCompleteListener() { // from class: com.taobao.tao.adapter.biz.plugins.watermask.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void onComplete() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                } else {
                    b.a(b.this).post(new Runnable() { // from class: com.taobao.tao.adapter.biz.plugins.watermask.b.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                aVar.a(a2);
                            }
                        }
                    });
                }
            }
        });
        this.b.setOnProgressListener(new OnProgressListener() { // from class: com.taobao.tao.adapter.biz.plugins.watermask.b.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void onProgress(final float f) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5ec8ea6d", new Object[]{this, new Float(f)});
                    return;
                }
                String str2 = "progress = " + f;
                b.a(b.this).post(new Runnable() { // from class: com.taobao.tao.adapter.biz.plugins.watermask.b.3.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            aVar.a((int) (f * 100.0f));
                        }
                    }
                });
            }
        });
        project.export(this.b);
    }

    private MediaExporter a(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaExporter) ipChange.ipc$dispatch("3c4b3cdd", new Object[]{this, str, new Integer(i), new Integer(i2)});
        }
        return new MediaExporter.Builder().setAudioConfig(new AudioConfiguration.Builder().setBps(131072).setFrequency(44100).setChannel(AudioConfiguration.ChannelType.CHANNEL_IN_STEREO).build()).setVideoConfig(new VideoConfiguration.Builder().setFps(23).setSize(i, i2).setBps(3200).build()).setOutputPath(str).setSyncPrepare(true).build();
    }
}
