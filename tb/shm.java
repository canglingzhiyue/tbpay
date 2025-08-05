package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes5.dex */
public interface shm {

    /* loaded from: classes5.dex */
    public static class a implements shm {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(150218719);
            kge.a(267465044);
        }

        @Override // tb.shm
        public void onActive(psw pswVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cababae8", new Object[]{this, pswVar});
            }
        }

        @Override // tb.shm
        public void onAppear(psw pswVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b1baaf7", new Object[]{this, pswVar});
            }
        }

        @Override // tb.shm
        public void onBindData(psw pswVar, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e0be620", new Object[]{this, pswVar, aVar, new Integer(i)});
            }
        }

        @Override // tb.shm
        public void onBindData(psw pswVar, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i, List list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5aa3311", new Object[]{this, pswVar, aVar, new Integer(i), list});
            }
        }

        @Override // tb.shm
        public void onCreateView(psw pswVar, snp snpVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af379f7e", new Object[]{this, pswVar, snpVar});
            }
        }

        @Override // tb.shm
        public void onDisActive(psw pswVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b2dc7738", new Object[]{this, pswVar});
            }
        }

        @Override // tb.shm
        public void onDisAppear(psw pswVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("733d6747", new Object[]{this, pswVar});
            }
        }

        @Override // tb.shm
        public void onRecycle(psw pswVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9576a57", new Object[]{this, pswVar});
            }
        }

        @Override // tb.shm
        public void onWillActive(psw pswVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("80ac5eda", new Object[]{this, pswVar});
            }
        }

        @Override // tb.shm
        public void onWillDisActive(psw pswVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5d1f606", new Object[]{this, pswVar});
            }
        }
    }

    void onActive(psw pswVar);

    void onAppear(psw pswVar);

    void onBindData(psw pswVar, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i);

    void onBindData(psw pswVar, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i, List<Object> list);

    void onCreateView(psw pswVar, snp snpVar);

    void onDisActive(psw pswVar);

    void onDisAppear(psw pswVar);

    void onRecycle(psw pswVar);

    void onWillActive(psw pswVar);

    void onWillDisActive(psw pswVar);
}
