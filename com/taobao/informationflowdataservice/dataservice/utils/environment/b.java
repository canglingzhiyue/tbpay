package com.taobao.informationflowdataservice.dataservice.utils.environment;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import tb.kge;
import tb.lxx;

/* loaded from: classes7.dex */
public class b implements com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(208724209);
        kge.a(-1010390149);
    }

    @Override // com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.a
    public lxx a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lxx) ipChange.ipc$dispatch("f078e32", new Object[]{this});
        }
        TBLocationDTO b = TBLocationClient.b();
        if (b != null) {
            return new a(b);
        }
        return null;
    }

    /* loaded from: classes7.dex */
    public class a implements lxx {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private TBLocationDTO b;

        static {
            kge.a(-17013855);
            kge.a(1534464124);
        }

        private a(TBLocationDTO tBLocationDTO) {
            this.b = tBLocationDTO;
        }

        @Override // tb.lxx
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b.longitude;
        }

        @Override // tb.lxx
        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b.latitude;
        }

        @Override // tb.lxx
        public String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.b.provinceCode;
        }

        @Override // tb.lxx
        public String d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.b.cityCode;
        }

        @Override // tb.lxx
        public String e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.b.areaCode;
        }

        @Override // tb.lxx
        public String f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.b.countryName;
        }

        @Override // tb.lxx
        public String g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.b.provinceName;
        }

        @Override // tb.lxx
        public String h() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.b.cityName;
        }

        @Override // tb.lxx
        public String i() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.b.areaName;
        }

        @Override // tb.lxx
        public String j() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.b.address;
        }

        @Override // tb.lxx
        public long k() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95766", new Object[]{this})).longValue() : this.b.timeStamp.longValue();
        }
    }
}
