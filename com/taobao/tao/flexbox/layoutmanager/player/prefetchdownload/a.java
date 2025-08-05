package com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.d;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.kge;
import tb.oeb;
import tb.ogg;
import tb.ogh;
import tb.oyx;
import tb.riy;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f20470a;
    private List<MediaInfoBean> b;
    private String d;
    private String e;
    private JSONObject f;
    private boolean h;
    private int c = 1048576;
    private C0853a<String> g = new C0853a<>(70);
    private List<String> i = new ArrayList(3);
    private Handler j = new Handler(Looper.getMainLooper()) { // from class: com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload.a.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (a.a(a.this)) {
                ogg.a("TNodePlayerPrefetchManager_FSVideoPreDownloader", "handleMessage isStopped, not preload！");
            } else {
                ogh.a("VideoPreDownloader");
                MediaInfoBean b = a.b(a.this);
                if (b != null) {
                    a.a(a.this, b);
                }
                ogh.b();
            }
        }
    };

    static {
        kge.a(104191189);
    }

    public static /* synthetic */ String a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c31293b5", new Object[]{aVar, str});
        }
        aVar.e = str;
        return str;
    }

    public static /* synthetic */ JSONObject a(a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cd28200b", new Object[]{aVar, jSONObject});
        }
        aVar.f = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ void a(a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf04a23", new Object[]{aVar, new Long(j)});
        } else {
            aVar.a(j);
        }
    }

    public static /* synthetic */ void a(a aVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b001f227", new Object[]{aVar, context});
        } else {
            aVar.a(context);
        }
    }

    public static /* synthetic */ void a(a aVar, MediaInfoBean mediaInfoBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24987ff9", new Object[]{aVar, mediaInfoBean});
        } else {
            aVar.a(mediaInfoBean);
        }
    }

    public static /* synthetic */ boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9828c4c5", new Object[]{aVar})).booleanValue() : aVar.h;
    }

    public static /* synthetic */ MediaInfoBean b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MediaInfoBean) ipChange.ipc$dispatch("fef77cc", new Object[]{aVar}) : aVar.b();
    }

    public static /* synthetic */ String b(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec7a0c94", new Object[]{aVar, str});
        }
        aVar.d = str;
        return str;
    }

    public static /* synthetic */ String c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("746faf3d", new Object[]{aVar}) : aVar.e;
    }

    public static /* synthetic */ Context d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("d495463c", new Object[]{aVar}) : aVar.f20470a;
    }

    public static /* synthetic */ List e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("30324ce2", new Object[]{aVar}) : aVar.i;
    }

    public static /* synthetic */ List f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("7831ab41", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ Handler g(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("c2f1919f", new Object[]{aVar}) : aVar.j;
    }

    public static /* synthetic */ C0853a h(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C0853a) ipChange.ipc$dispatch("57c3634a", new Object[]{aVar}) : aVar.g;
    }

    public a(Context context) {
        this.f20470a = context;
    }

    public void a(List<MediaInfoBean> list, PrefetchDownloadConfigBean prefetchDownloadConfigBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fa396c", new Object[]{this, list, prefetchDownloadConfigBean});
        } else if (!oeb.aw()) {
        } else {
            if (list != null) {
                StringBuilder sb = new StringBuilder();
                Iterator<MediaInfoBean> it = list.iterator();
                while (it.hasNext()) {
                    MediaInfoBean next = it.next();
                    sb.append(next != null ? next.videoId : "null");
                    sb.append(",");
                }
                ogg.a("TNodePlayerPrefetchManager_FSVideoPreDownloader", "调用批量预下载，listsize=" + list.size() + " ; [" + ((Object) sb) + riy.ARRAY_END_STR);
            }
            if (list != null) {
                this.b = new ArrayList(list);
            } else {
                this.b = null;
            }
            if (prefetchDownloadConfigBean != null && prefetchDownloadConfigBean.size != null && prefetchDownloadConfigBean.size.intValue() > 0) {
                this.c = prefetchDownloadConfigBean.size.intValue();
            }
            this.h = false;
            a(0L);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!oeb.aw()) {
        } else {
            this.h = true;
            a(this.f20470a);
        }
    }

    private void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (this.h) {
            ogg.a("TNodePlayerPrefetchManager_FSVideoPreDownloader", "toLoadNext isStopped, not proceed！");
        } else {
            String str = this.d;
            if (str != null && str.length() > 0) {
                ogg.a("TNodePlayerPrefetchManager_FSVideoPreDownloader", "preloadstatus toLoadNext is reloading, not proceed！mPreloadingUrl=" + this.d);
                return;
            }
            this.j.removeMessages(100);
            Message obtain = Message.obtain();
            obtain.what = 100;
            this.j.sendMessageDelayed(obtain, j);
        }
    }

    private MediaInfoBean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaInfoBean) ipChange.ipc$dispatch("726281c5", new Object[]{this});
        }
        List<MediaInfoBean> list = this.b;
        if (list == null || list.size() == 0) {
            return null;
        }
        MediaInfoBean mediaInfoBean = this.b.get(0);
        if (mediaInfoBean != null && !this.g.b(mediaInfoBean.videoId)) {
            return mediaInfoBean;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("预下载命中缓存: id=");
        sb.append(mediaInfoBean != null ? mediaInfoBean.videoId : "null");
        ogg.a("TNodePlayerPrefetchManager_FSVideoPreDownloader", sb.toString());
        this.b.remove(0);
        return b();
    }

    private void a(final MediaInfoBean mediaInfoBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68962d20", new Object[]{this, mediaInfoBean});
        } else if (mediaInfoBean == null) {
        } else {
            final String str = mediaInfoBean.videoId;
            String str2 = mediaInfoBean.videoResourceStr;
            ogg.a("TNodePlayerPrefetchManager_FSVideoPreDownloader", "播控: " + str2);
            JSONObject jSONObject = null;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(str2);
                    try {
                        if (mediaInfoBean.enableBitOpti) {
                            c.a(jSONObject2, false);
                        }
                        jSONObject = jSONObject2;
                    } catch (Exception e) {
                        e = e;
                        jSONObject = jSONObject2;
                        ogg.a("TNodePlayerPrefetchManager_FSVideoPreDownloader", "" + e);
                        if (jSONObject == null) {
                            return;
                        }
                        return;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
            if (jSONObject == null || this.f20470a == null) {
                return;
            }
            List<String> list = this.i;
            if (list != null && list.size() > 0 && !TextUtils.equals(this.i.get(0), str)) {
                this.i.clear();
            }
            final Runnable runnable = new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ogg.a("TNodePlayerPrefetchManager_FSVideoPreDownloader", "预下载超时了。取消当前视频，下载一下个");
                    ogh.a("VideoPreDownloaderTimeOut");
                    if (TextUtils.equals(a.c(a.this), str)) {
                        a aVar = a.this;
                        a.a(aVar, a.d(aVar));
                        a.a(a.this, (String) null);
                        a.b(a.this, null);
                        a.a(a.this, (JSONObject) null);
                        if (a.e(a.this) != null) {
                            if (a.e(a.this).size() <= 0 || !TextUtils.equals((CharSequence) a.e(a.this).get(0), str)) {
                                a.e(a.this).add(str);
                            } else {
                                a.f(a.this).remove(mediaInfoBean);
                                a.e(a.this).clear();
                            }
                        }
                    }
                    a.a(a.this, 500L);
                    ogh.b();
                }
            };
            String a2 = oyx.a(this.f20470a, jSONObject, this.c, new d() { // from class: com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.mediaplay.d
                public void a(String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str3});
                    }
                }

                @Override // com.taobao.mediaplay.d
                public void b(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
                    }
                }

                @Override // com.taobao.mediaplay.d
                public void a(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                        return;
                    }
                    ogh.a("VideoPreDownloaderFinish");
                    ogg.a("TNodePlayerPrefetchManager_FSVideoPreDownloader", "预下载完成 =====>" + str + "; size=" + i);
                    a.g(a.this).removeCallbacks(runnable);
                    if (i > 0) {
                        a.h(a.this).a(str);
                        a.f(a.this).remove(mediaInfoBean);
                    }
                    if (TextUtils.equals(a.c(a.this), str)) {
                        a.a(a.this, (String) null);
                        a.b(a.this, null);
                        a.a(a.this, (JSONObject) null);
                    }
                    a.a(a.this, 500L);
                    ogh.b();
                }
            });
            this.d = a2;
            this.e = str;
            this.f = jSONObject;
            ogg.a("TNodePlayerPrefetchManager_FSVideoPreDownloader", "开始预下载 " + str + "; downloadSize=" + this.c + ";url=" + a2);
            if (a2 != null && a2.length() > 0) {
                this.j.postDelayed(runnable, 7000L);
                return;
            }
            ogg.a("TNodePlayerPrefetchManager_FSVideoPreDownloader", "url为空，创建下载失败了，直接取消，下载下一个 ");
            runnable.run();
        }
    }

    private void a(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        ogh.a("VideoPreDownloaderCancel");
        this.j.removeMessages(100);
        if (context != null && (str = this.d) != null && str.length() > 0) {
            ogg.a("TNodePlayerPrefetchManager_FSVideoPreDownloader", "主动取消预下载..." + this.e + ". url=" + this.d);
            if (this.f != null && oeb.aV()) {
                try {
                    JSONArray jSONArray = this.f.getJSONArray("resources");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String string = jSONArray.getJSONObject(i).getString("cacheKey");
                        ogg.a("TNodePlayerPrefetchManager_FSVideoPreDownloader", "正在取消（新版）..." + this.e + ". cacheKey=" + string);
                        oyx.a(context, string);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    ogg.a("TNodePlayerPrefetchManager_FSVideoPreDownloader", "取消异常..." + e.getMessage());
                }
            } else {
                ogg.a("TNodePlayerPrefetchManager_FSVideoPreDownloader", "正在取消（老版）...");
                oyx.a(context, this.d);
            }
            this.d = null;
            this.f = null;
        }
        ogh.b();
    }

    /* renamed from: com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class C0853a<E> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f20474a;
        private final ArrayList<E> b = new ArrayList<>();

        static {
            kge.a(1474916584);
        }

        public C0853a(int i) {
            this.f20474a = i;
        }

        public void a(E e) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, e});
            } else if (this.b.remove(e)) {
                this.b.add(e);
            } else {
                if (this.b.size() >= this.f20474a) {
                    E remove = this.b.remove(0);
                    ogg.a("TNodePlayerPrefetchManager_FSVideoPreDownloader", "预下载达到缓存最大:" + this.f20474a + "。移除最老:" + remove);
                }
                this.b.add(e);
            }
        }

        public boolean b(E e) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f056ab89", new Object[]{this, e})).booleanValue() : this.b.contains(e);
        }
    }
}
