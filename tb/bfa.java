package tb;

import com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import tb.bed;

/* loaded from: classes2.dex */
public class bfa extends brx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f25842a;
    private StreamRemoteMainResponse b;

    static {
        kge.a(668830554);
    }

    public bfa(boolean z) {
        if (!z || !jqi.a("iCart", "listenerDXDownloadCallback", true) || !jqi.a("iCart", "preDownloadDX", true)) {
            return;
        }
        bed.a(bed.a.b("hitPreDXDownload").b(true).a(0.01f));
        a(new jnq<DXTemplateItem>() { // from class: tb.bfa.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jnq
            public void a(DXTemplateItem dXTemplateItem) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3a042611", new Object[]{this, dXTemplateItem});
                } else if (dXTemplateItem == null || dXTemplateItem.f() == null) {
                } else {
                    bed.a(bed.a.b("hitPreDXDownload").a(1).a(false).c(dXTemplateItem.f()).a(dXTemplateItem.b()).a(0.01f));
                }
            }
        });
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f25842a;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f25842a = str;
        }
    }

    public void a(StreamRemoteMainResponse streamRemoteMainResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4242a16c", new Object[]{this, streamRemoteMainResponse});
        } else {
            this.b = streamRemoteMainResponse;
        }
    }
}
