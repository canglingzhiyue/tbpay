package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.export.IUploaderEnvironment;
import com.uploader.export.IUploaderLog;
import com.uploader.export.UploaderGlobal;
import com.uploader.export.f;
import com.uploader.export.h;

/* loaded from: classes.dex */
public class rpb implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Context f33295a;
    private IUploaderEnvironment b;
    private IUploaderLog c;
    private h d;

    public rpb() {
        this(null, new rpd(UploaderGlobal.a()), new rpe(), new rpf());
    }

    public rpb(Context context) {
        this(context, new rpd(context), new rpe(), new rpf());
    }

    public rpb(Context context, IUploaderEnvironment iUploaderEnvironment) {
        this(context, iUploaderEnvironment, new rpe(), new rpf());
    }

    public rpb(Context context, IUploaderEnvironment iUploaderEnvironment, IUploaderLog iUploaderLog, h hVar) {
        if (context == null) {
            f33295a = UploaderGlobal.a();
        } else {
            f33295a = context;
        }
        this.b = iUploaderEnvironment;
        this.c = iUploaderLog;
        this.d = hVar;
    }

    @Override // com.uploader.export.f
    public IUploaderLog a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IUploaderLog) ipChange.ipc$dispatch("58855528", new Object[]{this}) : this.c;
    }

    @Override // com.uploader.export.f
    public h b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("794ce89a", new Object[]{this}) : this.d;
    }

    @Override // com.uploader.export.f
    public IUploaderEnvironment c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IUploaderEnvironment) ipChange.ipc$dispatch("77d87a77", new Object[]{this}) : this.b;
    }
}
