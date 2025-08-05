package com.taobao.android.mediapick;

import android.graphics.Color;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.media.Media;
import java.util.List;
import tb.hse;
import tb.hsg;
import tb.hso;
import tb.kge;

/* loaded from: classes6.dex */
public interface IMediaPickClient {

    /* loaded from: classes6.dex */
    public enum PickMode {
        SINGLE,
        MULTIP_REPEAT,
        MULTIP
    }

    /* loaded from: classes6.dex */
    public interface a {
        void a(Media media, int i);

        void b(Media media, int i);

        void c(Media media, int i);
    }

    View a();

    void a(int i);

    void a(PickMode pickMode);

    void a(a aVar);

    @Deprecated
    void a(b bVar);

    void a(d dVar);

    void a(e eVar);

    void a(Class<? extends c> cls);

    void a(hse hseVar);

    void a(hsg hsgVar);

    void a(hso hsoVar);

    boolean a(i iVar);

    <T extends Media> boolean a(T t, int i);

    d b();

    void b(int i);

    void b(b bVar);

    <T extends Media> boolean b(T t, int i);

    void c();

    List<Media> d();

    /* loaded from: classes6.dex */
    public static class b implements Cloneable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final int f14227a;
        public static b h;
        public int b = f14227a;
        public int c = 4;
        public int d = -1;
        public int e = 5;
        public boolean i = false;
        public boolean j = true;
        public boolean f = false;
        public String g = "";

        static {
            kge.a(1669226643);
            kge.a(-723128125);
            f14227a = Color.parseColor("#FFDD00");
            h = new b();
        }

        public Object clone() throws CloneNotSupportedException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : super.clone();
        }
    }
}
