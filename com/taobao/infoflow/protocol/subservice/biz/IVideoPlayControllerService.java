package com.taobao.infoflow.protocol.subservice.biz;

import com.taobao.infoflow.protocol.subservice.ISubService;

/* loaded from: classes.dex */
public interface IVideoPlayControllerService extends ISubService {
    public static final String SERVICE_NAME = "PlayControllerService";

    /* loaded from: classes.dex */
    public interface a {
        void a(b bVar);

        void b(b bVar);

        void c(b bVar);

        void d(b bVar);

        void e(b bVar);

        int g();

        void h();
    }

    /* loaded from: classes7.dex */
    public interface b {
        void a(a aVar);

        boolean a();

        void b(a aVar);
    }

    /* loaded from: classes7.dex */
    public interface c {
        void a();
    }

    void addCheckExecutePlayListener(c cVar);

    void forceInsertToQueueHeader(String str, int i);

    boolean isEnable();

    void removeCheckExecutePlayListener(c cVar);

    void triggerVideoStart();

    void triggerVideoStop();
}
