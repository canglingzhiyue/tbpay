package com.taobao.trtc.api;

import com.taobao.trtc.api.TrtcDefines;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public interface ITrtcObserver {

    /* loaded from: classes9.dex */
    public interface a {
        void b();

        void b(int i);

        void c();

        void e(String str);

        void f(String str);

        void g(String str);
    }

    /* loaded from: classes9.dex */
    public interface b {
        void a(int i, String str);

        void a(TrtcDefines.b bVar);

        void a(TrtcDefines.b bVar, TrtcDefines.TrtcAnswerType trtcAnswerType);

        void a(TrtcDefines.c cVar, TrtcDefines.TrtcAnswerType trtcAnswerType, String str);

        void a(String str, int i);

        void a(String str, int i, int i2, int i3);

        void a(String str, String str2);

        void a(ArrayList<TrtcDefines.c> arrayList, String str);

        void a(boolean z, int i, int i2, int i3);

        void a(boolean z, ArrayList<String> arrayList);

        void b(String str);

        void b(String str, String str2);

        void c(String str);

        void d(String str);
    }

    /* loaded from: classes9.dex */
    public interface c {
        void a(TrtcDefines.TrtcChannelAction trtcChannelAction, String str, String str2, String str3);

        void a(TrtcDefines.e eVar);

        void a(ArrayList<TrtcDefines.m> arrayList);

        void b(ArrayList<TrtcDefines.m> arrayList);

        void c(String str, String str2);

        void d(String str, String str2);
    }

    /* loaded from: classes9.dex */
    public interface d {
        void f(String str, String str2);
    }

    /* loaded from: classes9.dex */
    public interface e {
        void a();

        void a(int i);

        void a(TrtcDefines.TrtcErrorEvent trtcErrorEvent, int i, String str);

        void a(TrtcDefines.TrtcMediaConnectionState trtcMediaConnectionState);

        void a(TrtcDefines.TrtcNetWorkQuality trtcNetWorkQuality);

        void a(TrtcDefines.k kVar);

        void a(String str);

        void a(String str, int i, String str2, String str3, String str4);

        void a(String str, String str2, String str3, String str4);

        void a(String str, boolean z);

        void a(boolean z);

        void c(ArrayList<String> arrayList);

        void c(boolean z);
    }

    /* loaded from: classes9.dex */
    public interface f {
        void b(boolean z);

        void e(String str, String str2);

        @Deprecated
        void h(String str);
    }
}
