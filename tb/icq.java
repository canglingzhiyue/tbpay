package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.publisher.service.export.ayscpublish.core.APublishTask;
import com.taobao.android.publisher.service.export.ayscpublish.core.PublishError;
import com.taobao.android.publisher.service.export.ayscpublish.core.b;
import com.taobao.android.publisher.service.export.ayscpublish.core.c;

/* loaded from: classes6.dex */
public abstract class icq implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.c
    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20576e22", new Object[]{this, bVar});
        }
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.c
    public void a(b bVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea96bdde", new Object[]{this, bVar, new Float(f)});
        }
    }

    /* JADX WARN: Incorrect types in method signature: (TT;Lcom/taobao/android/publisher/service/export/ayscpublish/core/APublishTask$a;)V */
    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.c
    public /* synthetic */ void a(b bVar, APublishTask.a aVar) {
        c.CC.$default$a(this, bVar, aVar);
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.c
    public void a(b bVar, PublishError publishError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7150f59", new Object[]{this, bVar, publishError});
        }
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.c
    public void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a8fda3", new Object[]{this, bVar});
        }
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.c
    public void c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fa8d24", new Object[]{this, bVar});
        }
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.c
    public void d(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f44c1ca5", new Object[]{this, bVar});
        }
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.c
    public void e(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e59dac26", new Object[]{this, bVar});
        }
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.c
    public void f(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ef3ba7", new Object[]{this, bVar});
        }
    }
}
