package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.business.ShareContent;

/* loaded from: classes5.dex */
public class fjz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f28007a;
    private String b;
    private String c;
    private String d;
    private String e;

    static {
        kge.a(1861955717);
    }

    public fjz a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fjz) ipChange.ipc$dispatch("7c6f489e", new Object[]{this, str});
        }
        this.f28007a = str;
        return this;
    }

    public fjz b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fjz) ipChange.ipc$dispatch("7d1bf43d", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public fjz c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fjz) ipChange.ipc$dispatch("7dc89fdc", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }

    public fjz d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fjz) ipChange.ipc$dispatch("7e754b7b", new Object[]{this, str});
        }
        this.d = str;
        return this;
    }

    public fjz e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fjz) ipChange.ipc$dispatch("7f21f71a", new Object[]{this, str});
        }
        this.e = str;
        return this;
    }

    public ShareContent a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("865487a6", new Object[]{this});
        }
        ShareContent shareContent = new ShareContent();
        shareContent.imageUrl = this.f28007a;
        shareContent.businessId = this.b;
        shareContent.description = this.c;
        shareContent.url = this.d;
        shareContent.title = this.e;
        return shareContent;
    }
}
