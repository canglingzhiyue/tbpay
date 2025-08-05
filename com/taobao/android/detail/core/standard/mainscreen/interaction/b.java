package com.taobao.android.detail.core.standard.mainscreen.interaction;

import android.text.TextUtils;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.mainscreen.interaction.b;
import com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer;
import com.taobao.android.detail.core.standard.video.d;
import com.taobao.android.detail.core.standard.video.m;
import java.util.HashMap;
import java.util.Map;
import tb.emk;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, b> f9861a;
    private boolean c;
    private Map<String, com.taobao.android.detail.core.standard.mainscreen.interaction.a> b = new HashMap();
    private a d = new a() { // from class: com.taobao.android.detail.core.standard.mainscreen.interaction.b.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
            if (str.hashCode() == 140232799) {
                super.a((AbsPicGalleryVideoPlayer) objArr[0], (m) objArr[1], ((Number) objArr[2]).floatValue());
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // com.taobao.android.detail.core.standard.mainscreen.interaction.b.a, com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
        public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar, final float f) {
            com.taobao.android.detail.core.standard.mainscreen.interaction.a d;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85bc85f", new Object[]{this, absPicGalleryVideoPlayer, mVar, new Float(f)});
                return;
            }
            super.a(absPicGalleryVideoPlayer, mVar, f);
            String a2 = a(mVar);
            if (TextUtils.isEmpty(a2) || (d = b.this.d(a2)) == null) {
                return;
            }
            d.a("progress_sync", new HashMap<String, Object>() { // from class: com.taobao.android.detail.core.standard.mainscreen.interaction.VideoToWeexStateSyncManager$1$1
                {
                    b.AnonymousClass1.this = this;
                    put("progress_value", Float.valueOf(f));
                }
            });
        }

        private String a(m mVar) {
            Object a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2f756d73", new Object[]{this, mVar});
            }
            if (mVar != null && (a2 = mVar.a(emk.KEY_STATE_SYNC_TOKEN)) != null) {
                return a2.toString();
            }
            return null;
        }
    };

    static {
        kge.a(1976017278);
        f9861a = new HashMap();
    }

    private b() {
        emu.a("com.taobao.android.detail.core.standard.mainscreen.interaction.VideoToWeexStateSyncManager");
    }

    public static synchronized void a(String str) {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            } else {
                f9861a.put(str, new b());
            }
        }
    }

    public static synchronized b b(String str) {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5d5e224a", new Object[]{str});
            }
            return f9861a.get(str);
        }
    }

    public static synchronized void c(String str) {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88097eb4", new Object[]{str});
            } else {
                f9861a.remove(str);
            }
        }
    }

    public static String a(q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d9e75af", new Object[]{qVar});
        }
        if (qVar == null) {
            return null;
        }
        return (String) qVar.a("token", String.class);
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fc1c376", new Object[]{this, dVar});
        } else if (dVar == null || this.c) {
        } else {
            this.c = true;
            dVar.a(this.d);
        }
    }

    public void a(String str, com.taobao.android.detail.core.standard.mainscreen.interaction.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba6f309a", new Object[]{this, str, aVar});
        } else {
            this.b.put(str, aVar);
        }
    }

    public com.taobao.android.detail.core.standard.mainscreen.interaction.a d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.core.standard.mainscreen.interaction.a) ipChange.ipc$dispatch("22144fe9", new Object[]{this, str}) : this.b.get(str);
    }

    /* loaded from: classes4.dex */
    public static class a implements AbsPicGalleryVideoPlayer.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1556766575);
            kge.a(-764126303);
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
        public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6768f81", new Object[]{this, absPicGalleryVideoPlayer, mVar});
            }
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
        public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85bc85f", new Object[]{this, absPicGalleryVideoPlayer, mVar, new Float(f)});
            }
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
        public void a(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a8fd815", new Object[]{this, absPicGalleryVideoPlayer, mVar, str, str2});
            }
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
        public void b(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9a88720", new Object[]{this, absPicGalleryVideoPlayer, mVar});
            }
        }

        @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer.a
        public void c(AbsPicGalleryVideoPlayer absPicGalleryVideoPlayer, m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acda7ebf", new Object[]{this, absPicGalleryVideoPlayer, mVar});
            }
        }

        private a() {
        }
    }
}
