package tb;

import com.alibaba.evo.internal.event.ExperimentWhitelistDataV5;
import com.alibaba.evo.internal.event.b;
import com.alibaba.evo.internal.event.d;
import com.alibaba.fastjson.annotation.JSONField;

/* loaded from: classes2.dex */
public class bwt {
    @JSONField(name = "exp")

    /* renamed from: a  reason: collision with root package name */
    public d f26152a;
    @JSONField(name = "beta")
    public b b;
    @JSONField(name = "whitelist")
    public ExperimentWhitelistDataV5 c;
    @JSONField(name = "md5")
    public String d;
    @JSONField(name = "msgInfo")
    public String e;
    @JSONField(name = "msgCode")
    public String f;
    @JSONField(name = "success")
    public boolean g = false;
    @JSONField(name = "nextAvailableTime")
    public long h = -1;

    static {
        kge.a(-463006009);
    }
}
