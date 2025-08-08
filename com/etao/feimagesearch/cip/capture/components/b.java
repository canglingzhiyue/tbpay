package com.etao.feimagesearch.cip.capture.components;

import android.content.Context;
import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.k;
import com.etao.feimagesearch.util.al;
import com.etao.feimagesearch.util.t;
import com.etao.imagesearch.component.preview.PreviewManager;
import java.io.File;
import java.util.Date;
import java.util.List;
import tb.com;
import tb.kge;

/* loaded from: classes3.dex */
public class b extends AsyncTask<Void, Void, List<AlbumMediaItem>> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_PREVIEW_ID = "plt:preview_id";

    /* renamed from: a  reason: collision with root package name */
    private final InterfaceC0224b f6658a;
    private int b;
    private boolean c = true;

    /* renamed from: com.etao.feimagesearch.cip.capture.components.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0224b {
        boolean isResumed();

        void onRecentImageShow(List<AlbumMediaItem> list);
    }

    static {
        kge.a(-1567358243);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List<com.etao.feimagesearch.cip.capture.components.AlbumMediaItem>] */
    @Override // android.os.AsyncTask
    public /* synthetic */ List<AlbumMediaItem> doInBackground(Void[] voidArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
    }

    @Override // android.os.AsyncTask
    public /* synthetic */ void onPostExecute(List<AlbumMediaItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b105c779", new Object[]{this, list});
        } else {
            a(list);
        }
    }

    public b(InterfaceC0224b interfaceC0224b, int i) {
        this.b = 1;
        this.f6658a = interfaceC0224b;
        this.b = i;
    }

    private List<AlbumMediaItem> a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("962721e7", new Object[]{this, context}) : a(context, this.b);
    }

    private List<AlbumMediaItem> a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ca6f3d44", new Object[]{this, context, new Integer(i)});
        }
        if (i != 0) {
            return t.a(10L);
        }
        return null;
    }

    private List<AlbumMediaItem> c(Context context) {
        long j;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cb68a6e9", new Object[]{this, context});
        }
        if (!al.a(context)) {
            return null;
        }
        List<AlbumMediaItem> a2 = a(context);
        AlbumMediaItem albumMediaItem = (a2 == null || a2.size() <= 0) ? null : a2.get(0);
        if (albumMediaItem == null || StringUtils.isEmpty(albumMediaItem.imgFilePath)) {
            return null;
        }
        if (!albumMediaItem.imgFilePath.contains("拍立淘")) {
            if (!StringUtils.isEmpty(albumMediaItem.lastUpdateTime) && !PreviewManager.f7104a.equals(albumMediaItem.id)) {
                try {
                    j = Long.parseLong(albumMediaItem.lastUpdateTime) * 1000;
                } catch (Exception unused) {
                    j = -1;
                }
                if ((new Date().getTime() - j) / 1000 > PreviewManager.b) {
                    z = false;
                }
                albumMediaItem.canShow = z;
            } else {
                albumMediaItem.canShow = false;
            }
        } else {
            albumMediaItem.canShow = false;
        }
        return a2;
    }

    public List<AlbumMediaItem> a(Void... voidArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ed23ac73", new Object[]{this, voidArr});
        }
        List<AlbumMediaItem> c = c(com.b());
        if (c == null || c.isEmpty()) {
            return null;
        }
        AlbumMediaItem albumMediaItem = c.get(0);
        if (!new File(albumMediaItem.imgFilePath).exists() && !new File(albumMediaItem.imgUri.toString()).exists()) {
            return null;
        }
        return c;
    }

    public void a(List<AlbumMediaItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (PreviewManager.a() || list == null || list.isEmpty()) {
            this.f6658a.onRecentImageShow(null);
        } else {
            AlbumMediaItem albumMediaItem = list.get(0);
            if (albumMediaItem.canShow) {
                if (StringUtils.equals(PreviewManager.f7104a, albumMediaItem.id)) {
                    albumMediaItem.canShow = false;
                } else if (this.c) {
                    PreviewManager.f7104a = albumMediaItem.id;
                    k.a(com.b(), KEY_PREVIEW_ID, albumMediaItem.id);
                }
            }
            if (!this.f6658a.isResumed()) {
                return;
            }
            this.f6658a.onRecentImageShow(list);
        }
    }
}
