package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.utils.d;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class jzw implements jzx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Call f29902a;

    static {
        kge.a(677342399);
        kge.a(-22458245);
    }

    public abstract Object a(Object[] objArr) throws IPCException;

    public jzw(Call call) {
        this.f29902a = call;
    }

    @Override // tb.jzx
    public Reply a() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reply) ipChange.ipc$dispatch("41866efb", new Object[]{this});
        }
        ArrayList<Integer> arrayList = new ArrayList();
        Object[] a2 = d.a(this.f29902a.getParameterWrappers(), arrayList);
        long currentTimeMillis = System.currentTimeMillis();
        Reply invokeTime = Reply.obtain().setResult(a(a2)).setInvokeTime(System.currentTimeMillis() - currentTimeMillis);
        if (!arrayList.isEmpty()) {
            ParameterWrapper[] parameterWrapperArr = new ParameterWrapper[arrayList.size()];
            for (Integer num : arrayList) {
                int intValue = num.intValue();
                parameterWrapperArr[intValue] = ParameterWrapper.obtain().setData(a2[((Integer) arrayList.get(intValue)).intValue()]);
            }
            invokeTime.setFlowParameterWrappers(parameterWrapperArr);
        }
        return invokeTime;
    }
}
