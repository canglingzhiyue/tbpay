package tb;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;

/* loaded from: classes8.dex */
public class nvw {
    static {
        kge.a(-221983529);
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public AuctionBaseBean f31801a;
        public ViewGroup b;

        static {
            kge.a(1501666924);
        }

        private a(AuctionBaseBean auctionBaseBean, ViewGroup viewGroup) {
            this.f31801a = auctionBaseBean;
            this.b = viewGroup;
        }

        public static a a(AuctionBaseBean auctionBaseBean, ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b8e4bb92", new Object[]{auctionBaseBean, viewGroup}) : new a(auctionBaseBean, viewGroup);
        }
    }
}
