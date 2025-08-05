package com.taobao.tao.log.logger;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.Executor;
import tb.kge;

/* loaded from: classes.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "data")
    public Map<String, String> data = null;

    static {
        kge.a(527969637);
    }

    public abstract void log();

    public void log(Executor executor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c0f2eb", new Object[]{this, executor});
        } else if (executor == null) {
        } else {
            executor.execute(new Runnable() { // from class: com.taobao.tao.log.logger.-$$Lambda$XVhFm5dtpcCUCD3KY9wsRW-LirU
                {
                    a.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a.this.log();
                }
            });
        }
    }

    public Map<String, String> getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this}) : this.data;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : JSON.toJSONString(this);
    }
}
