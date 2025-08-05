package com.taobao.android.diagnose.scene.engine.reader;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private File b;

    static {
        kge.a(-267893538);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -89740987) {
            if (hashCode != 1651902687) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return super.a();
        }
        return super.b();
    }

    public a(File file) {
        super("");
        this.b = file;
    }

    @Override // com.taobao.android.diagnose.scene.engine.reader.b
    public List<RuleDefine> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        this.f11721a = com.taobao.android.diagnose.common.d.a(this.b);
        return super.a();
    }

    @Override // com.taobao.android.diagnose.scene.engine.reader.b
    public RuleDefine b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RuleDefine) ipChange.ipc$dispatch("faa6a945", new Object[]{this});
        }
        this.f11721a = com.taobao.android.diagnose.common.d.a(this.b);
        return super.b();
    }
}
