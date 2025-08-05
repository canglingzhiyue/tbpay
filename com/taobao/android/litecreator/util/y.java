package com.taobao.android.litecreator.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.media.ImageMedia;
import com.taobao.android.mediapick.media.LocalMedia;
import com.taobao.android.mediapick.media.VideoMedia;
import tb.hsm;
import tb.kge;

/* loaded from: classes5.dex */
public class y extends hsm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f13516a;
    public static int b;

    public static /* synthetic */ Object ipc$super(y yVar, String str, Object... objArr) {
        if (str.hashCode() == -1132091406) {
            return super.a((Context) objArr[0], (LocalMedia) objArr[1], ((Boolean) objArr[2]).booleanValue());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-612450241);
        f13516a = 512;
        b = 720;
    }

    public y(Context context) {
        super(context);
    }

    @Override // tb.hsm, tb.hsi
    public Bitmap a(Context context, LocalMedia localMedia, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("bc85a7f2", new Object[]{this, context, localMedia, new Boolean(z)});
        }
        if (localMedia != null && a(localMedia) && localMedia.path != null) {
            if (localMedia instanceof VideoMedia) {
                return b(localMedia);
            }
            if (localMedia instanceof ImageMedia) {
                return a(localMedia, z);
            }
        }
        return super.a(context, localMedia, z);
    }

    private boolean a(LocalMedia localMedia) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2e161cbc", new Object[]{this, localMedia})).booleanValue() : ((long) localMedia.id) <= 0;
    }

    private Bitmap a(LocalMedia localMedia, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("46be7fa", new Object[]{this, localMedia, new Boolean(z)});
        }
        return c.a(localMedia.path, z ? b : f13516a, true);
    }

    private Bitmap b(LocalMedia localMedia) {
        MediaMetadataRetriever mediaMetadataRetriever;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("803cf0f5", new Object[]{this, localMedia});
        }
        try {
            mediaMetadataRetriever = new MediaMetadataRetriever();
        } catch (Exception unused) {
            mediaMetadataRetriever = null;
        } catch (Throwable th) {
            th = th;
            mediaMetadataRetriever = null;
        }
        try {
            mediaMetadataRetriever.setDataSource(localMedia.path);
            Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
            mediaMetadataRetriever.release();
            return frameAtTime;
        } catch (Exception unused2) {
            if (mediaMetadataRetriever != null) {
                mediaMetadataRetriever.release();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            if (mediaMetadataRetriever != null) {
                mediaMetadataRetriever.release();
            }
            throw th;
        }
    }
}
