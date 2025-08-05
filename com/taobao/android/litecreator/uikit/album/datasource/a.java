package com.taobao.android.litecreator.uikit.album.datasource;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.u;
import com.taobao.android.mediapick.media.ImageMedia;
import com.taobao.android.mediapick.media.Media;
import com.taobao.android.mediapick.media.MediaBucket;
import com.taobao.tao.util.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import tb.hsc;
import tb.hsl;
import tb.hsp;
import tb.kge;

/* loaded from: classes5.dex */
public class a extends hsc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static List<MediaBucket> f13474a;
    public static List<Media> b;
    public static final HashSet<String> c;
    public int d;
    public HashMap<String, HashSet<String>> e;
    public String f;
    public boolean g;
    public boolean l;
    public C0521a m;
    private MediaBucket n;

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public boolean a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2619793f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue() : i > i2 && i < i3;
    }

    static {
        kge.a(1698872306);
        c = new HashSet<String>() { // from class: com.taobao.android.litecreator.uikit.album.datasource.CommonASCDataSource$1
            {
                add("image/jpg");
                add(Constants.SHARETYPE_WITH_QRCODE);
                add("image/jpeg");
                add("image/heic");
                add("image/heif");
            }
        };
    }

    public a(MediaBucket mediaBucket) {
        this(mediaBucket, 0);
    }

    public a(MediaBucket mediaBucket, int i) {
        super(mediaBucket, i);
        this.e = new HashMap<>();
        this.f = "common";
        this.l = false;
        this.n = mediaBucket;
    }

    public void a(C0521a c0521a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7895fd94", new Object[]{this, c0521a});
        } else {
            this.m = c0521a;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    @Override // com.taobao.android.mediapick.d
    public boolean b(Media media) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57572940", new Object[]{this, media})).booleanValue();
        }
        if (media instanceof ImageMedia) {
            return c(media);
        }
        return false;
    }

    @Override // tb.hsc, com.taobao.android.mediapick.d
    public List<Media> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        List<Media> b2 = b();
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        u.b("LCAlbumPresenter.sql query cost=" + elapsedRealtime2, new Object[0]);
        return b2;
    }

    private List<Media> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        try {
            if (this.m != null) {
                this.m.a(this.l);
                return this.m.a(j(), this.n, h());
            }
            return hsl.a(j(), this.n, g(), h(), this.l);
        } catch (Throwable unused) {
            return new ArrayList();
        }
    }

    public boolean c(Media media) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccd14f81", new Object[]{this, media})).booleanValue();
        }
        ImageMedia imageMedia = (ImageMedia) media;
        return a(imageMedia.width, 0, this.d) || a(imageMedia.height, 0, this.d) || TextUtils.isEmpty(imageMedia.mimeType) || !b(this.f).contains(imageMedia.mimeType.toLowerCase());
    }

    public HashSet<String> b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashSet) ipChange.ipc$dispatch("30b08dd0", new Object[]{this, str}) : c;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    /* renamed from: com.taobao.android.litecreator.uikit.album.datasource.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0521a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private List<Media> f13475a;
        private boolean b;

        static {
            kge.a(285843587);
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.b = z;
            }
        }

        public synchronized List<Media> a(Context context, MediaBucket mediaBucket, hsp hspVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("8b4a52d3", new Object[]{this, context, mediaBucket, hspVar});
            } else if (this.f13475a != null && this.f13475a.size() > 0) {
                return this.f13475a;
            } else if (mediaBucket.bucketId == -1 && a.b != null && a.b.size() > 0) {
                return a.b;
            } else {
                this.f13475a = hsl.a(context, mediaBucket, 0, hspVar, this.b);
                return this.f13475a;
            }
        }
    }
}
