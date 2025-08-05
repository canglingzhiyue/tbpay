package com.taobao.android.detail.alicom.widget;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alicom.adapter.PhonenumCityAdapter;
import com.taobao.android.detail.alicom.adapter.PhonenumNetworkAdapter;
import com.taobao.android.detail.alicom.adapter.PhonenumNumberAdapter;
import com.taobao.android.detail.alicom.adapter.PhonenumPlanAdapter;
import com.taobao.android.detail.alicom.model.ContractCityInfo;
import com.taobao.android.detail.alicom.model.ContractSelectedRet;
import com.taobao.android.detail.alicom.model.FetchComponentData;
import com.taobao.android.detail.alicom.model.network.PreholdingPhoneNumberData;
import com.taobao.android.detail.alicom.model.network.PreholdingPhoneNumberResult;
import com.taobao.android.detail.alicom.model.network.QueryContractPhoneNumberData;
import com.taobao.android.detail.alicom.model.network.QueryContractPhoneNumberResult;
import com.taobao.android.detail.alicom.mtop.RemoteBusinessListener;
import com.taobao.android.detail.alicom.view.PhonenumSideBar;
import com.taobao.android.detail.alicom.widget.b;
import com.taobao.android.detail.kit.view.widget.base.uikit.view.TBCircularProgress;
import com.taobao.android.detail.sdk.model.node.ContractNode;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taobao.R;
import com.taobao.trtc.api.TrtcConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;
import tb.dwe;
import tb.dwf;
import tb.kge;

/* loaded from: classes4.dex */
public class b extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String A;
    private ContractCityInfo B;
    private FetchComponentData.FetchModel.ComponentData.Plan C;
    private FetchComponentData.FetchModel.ComponentData.Network D;
    private String E;
    private List<FetchComponentData.FetchModel.ComponentData.Plan> F;
    private List<FetchComponentData.FetchModel.ComponentData.Network> G;
    private RemoteBusiness H;
    private RemoteBusinessListener I;
    private boolean J;
    private boolean K;
    private com.taobao.android.detail.alicom.widget.a L;

    /* renamed from: a */
    private Activity f9333a;
    private RelativeLayout b;
    private RelativeLayout c;
    private RelativeLayout d;
    private RelativeLayout e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private Button n;
    private ImageView o;
    private TextView p;
    private View q;
    private TBCircularProgress r;
    private FetchComponentData.FetchModel.ComponentData s;
    private ContractSelectedRet t;
    private ContractNode.Version u;
    private List<ContractCityInfo> v;
    private List<FetchComponentData.FetchModel.ComponentData.Network> w;
    private List<FetchComponentData.FetchModel.ComponentData.Plan> x;
    private List<String> y;
    private String z;

    static {
        kge.a(-1978889897);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 143326307) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onBackPressed();
            return null;
        }
    }

    public static /* synthetic */ Activity a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("d5b87ac7", new Object[]{bVar}) : bVar.f9333a;
    }

    public static /* synthetic */ void a(b bVar, ContractCityInfo contractCityInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f28d796e", new Object[]{bVar, contractCityInfo});
        } else {
            bVar.a(contractCityInfo);
        }
    }

    public static /* synthetic */ void a(b bVar, FetchComponentData.FetchModel.ComponentData.Network network) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73634f64", new Object[]{bVar, network});
        } else {
            bVar.a(network);
        }
    }

    public static /* synthetic */ void a(b bVar, FetchComponentData.FetchModel.ComponentData.Plan plan) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8e7f9b5", new Object[]{bVar, plan});
        } else {
            bVar.a(plan);
        }
    }

    public static /* synthetic */ void a(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f762960b", new Object[]{bVar, str});
        } else {
            bVar.b(str);
        }
    }

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a83d5877", new Object[]{bVar, new Boolean(z)})).booleanValue();
        }
        bVar.J = z;
        return z;
    }

    public static /* synthetic */ TextView b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("15a4d4d4", new Object[]{bVar}) : bVar.j;
    }

    public static /* synthetic */ void b(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61921e2a", new Object[]{bVar, str});
        } else {
            bVar.a(str);
        }
    }

    public static /* synthetic */ List c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f1a3be28", new Object[]{bVar}) : bVar.v;
    }

    public static /* synthetic */ List d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e5334269", new Object[]{bVar}) : bVar.y;
    }

    public static /* synthetic */ ContractCityInfo e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ContractCityInfo) ipChange.ipc$dispatch("7a188bc", new Object[]{bVar}) : bVar.B;
    }

    public static /* synthetic */ RelativeLayout f(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RelativeLayout) ipChange.ipc$dispatch("df8a47ec", new Object[]{bVar}) : bVar.b;
    }

    public static /* synthetic */ TextView g(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("a11a5d2f", new Object[]{bVar}) : bVar.k;
    }

    public static /* synthetic */ List h(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b371536d", new Object[]{bVar}) : bVar.F;
    }

    public static /* synthetic */ FetchComponentData.FetchModel.ComponentData.Plan i(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FetchComponentData.FetchModel.ComponentData.Plan) ipChange.ipc$dispatch("ccde363f", new Object[]{bVar}) : bVar.C;
    }

    public static /* synthetic */ RelativeLayout j(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RelativeLayout) ipChange.ipc$dispatch("438f8e68", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ TextView k(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("aa4530ab", new Object[]{bVar}) : bVar.l;
    }

    public static /* synthetic */ List l(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("81af6471", new Object[]{bVar}) : bVar.G;
    }

    public static /* synthetic */ FetchComponentData.FetchModel.ComponentData.Network m(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FetchComponentData.FetchModel.ComponentData.Network) ipChange.ipc$dispatch("c0df83a4", new Object[]{bVar}) : bVar.D;
    }

    public static /* synthetic */ RelativeLayout n(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RelativeLayout) ipChange.ipc$dispatch("a794d4e4", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ TextView o(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("b3700427", new Object[]{bVar}) : bVar.m;
    }

    public static /* synthetic */ String p(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1d45844e", new Object[]{bVar}) : bVar.E;
    }

    public static /* synthetic */ String q(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6b04fc4f", new Object[]{bVar}) : bVar.z;
    }

    public static /* synthetic */ String r(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b8c47450", new Object[]{bVar}) : bVar.A;
    }

    public static /* synthetic */ ContractNode.Version s(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ContractNode.Version) ipChange.ipc$dispatch("9267811", new Object[]{bVar}) : bVar.u;
    }

    public static /* synthetic */ boolean t(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fce2ae12", new Object[]{bVar})).booleanValue() : bVar.k();
    }

    public static /* synthetic */ RelativeLayout u(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RelativeLayout) ipChange.ipc$dispatch("569e103d", new Object[]{bVar}) : bVar.e;
    }

    public static /* synthetic */ void v(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7077f1cc", new Object[]{bVar});
        } else {
            bVar.n();
        }
    }

    public b(boolean z, Activity activity, com.taobao.android.detail.alicom.widget.a aVar, ContractNode contractNode, String str, String str2, ContractSelectedRet contractSelectedRet) {
        super(activity, 16973840);
        this.J = false;
        this.K = true;
        this.K = z;
        this.f9333a = activity;
        this.t = contractSelectedRet;
        this.z = str;
        this.A = str2;
        this.L = aVar;
        if (contractNode != null) {
            this.u = contractNode.version;
            this.s = a(contractNode.componentData);
        }
    }

    private FetchComponentData.FetchModel.ComponentData a(List<Map<String, Object>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FetchComponentData.FetchModel.ComponentData) ipChange.ipc$dispatch("5b64cfea", new Object[]{this, list});
        }
        try {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < list.size(); i++) {
                for (Map.Entry<String, Object> entry : list.get(i).entrySet()) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return (FetchComponentData.FetchModel.ComponentData) JSON.parseObject(JSON.toJSONString(hashMap), FetchComponentData.FetchModel.ComponentData.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        getWindow().setSoftInputMode(35);
        getWindow().setWindowAnimations(16973826);
        setContentView(R.layout.detail_phonenum_sale_dialog);
        dwe.a(this.f9333a, "Page_Contract", "Page_Contract", this.K ? "contractPhone" : TrtcConstants.TRTC_PARAMS_PHONE_NUMBER);
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b = (RelativeLayout) findViewById(R.id.detail_phonenumber_region_rl);
        this.c = (RelativeLayout) findViewById(R.id.detail_phonenumber_plan_rl);
        this.d = (RelativeLayout) findViewById(R.id.detail_phonenumber_network_rl);
        this.e = (RelativeLayout) findViewById(R.id.detail_phonenumber_phone_rl);
        this.f = (TextView) findViewById(R.id.detail_phonenumber_city_tv);
        this.g = (TextView) findViewById(R.id.detail_phonenumber_plan_tv);
        this.h = (TextView) findViewById(R.id.detail_phonenumber_network_tv);
        this.i = (TextView) findViewById(R.id.detail_phonenumber_number_tv);
        this.j = (TextView) findViewById(R.id.detail_phonenumber_city_title_tv);
        this.k = (TextView) findViewById(R.id.detail_phonenumber_plan_title_tv);
        this.l = (TextView) findViewById(R.id.detail_phonenumber_network_title_tv);
        this.m = (TextView) findViewById(R.id.detail_phonenumber_number_title_tv);
        this.o = (ImageView) findViewById(R.id.detail_phonenumber_back_iv);
        this.p = (TextView) findViewById(R.id.detail_phonenumber_title_tv);
        this.n = (Button) findViewById(R.id.detail_phonenumber_plan_ok_btn);
        this.q = findViewById(R.id.detail_phonenum_diaog_mask);
        this.r = (TBCircularProgress) findViewById(R.id.detail_phonenumber_dialog_progressBar);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.taobao.android.detail.alicom.widget.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                b.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (view.getId() == R.id.detail_phonenumber_region_rl) {
                    b bVar = b.this;
                    a aVar = new a(b.a(bVar), b.b(b.this).getText().toString(), b.c(b.this), b.d(b.this), b.e(b.this));
                    aVar.setCanceledOnTouchOutside(false);
                    aVar.show();
                    dwe.c(b.a(b.this));
                } else if (view.getId() == R.id.detail_phonenumber_plan_rl) {
                    if (b.f(b.this).getVisibility() == 0 && b.e(b.this) == null) {
                        Toast.makeText(b.this.getContext(), "亲，请先选择城市~", 0).show();
                        return;
                    }
                    b bVar2 = b.this;
                    d dVar = new d(b.a(bVar2), b.g(b.this).getText().toString(), b.h(b.this), b.i(b.this));
                    dVar.setCanceledOnTouchOutside(false);
                    dVar.show();
                    dwe.d(b.a(b.this));
                } else if (view.getId() == R.id.detail_phonenumber_network_rl) {
                    if (b.f(b.this).getVisibility() == 0 && b.e(b.this) == null) {
                        Toast.makeText(b.this.getContext(), "亲，请先选择城市~", 0).show();
                    } else if (b.j(b.this).getVisibility() == 0 && b.i(b.this) == null) {
                        Toast.makeText(b.this.getContext(), "亲，请先选择套餐~", 0).show();
                    } else {
                        b bVar3 = b.this;
                        DialogC0362b dialogC0362b = new DialogC0362b(b.a(bVar3), b.k(b.this).getText().toString(), b.l(b.this), b.m(b.this));
                        dialogC0362b.setCanceledOnTouchOutside(false);
                        dialogC0362b.show();
                        dwe.e(b.a(b.this));
                    }
                } else if (view.getId() != R.id.detail_phonenumber_phone_rl) {
                    if (view.getId() == R.id.detail_phonenumber_back_iv) {
                        dwe.b(b.a(b.this));
                        b.this.onBackPressed();
                    } else if (view.getId() != R.id.detail_phonenumber_plan_ok_btn || !b.t(b.this)) {
                    } else {
                        dwe.a(b.a(b.this));
                        if (b.u(b.this).getVisibility() == 0) {
                            b bVar4 = b.this;
                            b.a(bVar4, b.p(bVar4));
                            return;
                        }
                        b.a(b.this, true);
                        b.this.onBackPressed();
                    }
                } else if (b.f(b.this).getVisibility() == 0 && b.e(b.this) == null) {
                    Toast.makeText(b.this.getContext(), "亲，请先选择城市~", 0).show();
                } else if (b.j(b.this).getVisibility() == 0 && b.i(b.this) == null) {
                    Toast.makeText(b.this.getContext(), "亲，请先选择套餐~", 0).show();
                } else if (b.n(b.this).getVisibility() == 0 && b.m(b.this) == null) {
                    Toast.makeText(b.this.getContext(), "亲，请先选择制式~", 0).show();
                } else {
                    b bVar5 = b.this;
                    c cVar = new c(b.a(bVar5), b.o(b.this).getText().toString(), b.p(b.this), b.q(b.this), b.r(b.this), b.s(b.this) == null ? "" : b.s(b.this).versionCode, b.m(b.this) == null ? "" : b.m(b.this).code, (b.e(b.this) == null || b.e(b.this).city == null) ? "" : b.e(b.this).city.code, b.e(b.this) == null ? "" : b.e(b.this).provinceCode, b.i(b.this) == null ? "" : b.i(b.this).planId);
                    cVar.setCanceledOnTouchOutside(false);
                    cVar.show();
                    dwe.f(b.a(b.this));
                }
            }
        };
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: com.taobao.android.detail.alicom.widget.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                b.this = this;
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                return true;
            }
        };
        this.b.setOnClickListener(onClickListener);
        this.c.setOnClickListener(onClickListener);
        this.d.setOnClickListener(onClickListener);
        this.e.setOnClickListener(onClickListener);
        this.o.setOnClickListener(onClickListener);
        this.n.setOnClickListener(onClickListener);
        this.q.setOnTouchListener(onTouchListener);
        c();
        b();
        d();
        e();
        FetchComponentData.FetchModel.ComponentData componentData = this.s;
        if (componentData != null && !TextUtils.isEmpty(componentData.areaName)) {
            this.j.setText(this.s.areaName);
        }
        FetchComponentData.FetchModel.ComponentData componentData2 = this.s;
        if (componentData2 != null && !TextUtils.isEmpty(componentData2.planLiteName)) {
            this.k.setText(this.s.planLiteName);
        }
        FetchComponentData.FetchModel.ComponentData componentData3 = this.s;
        if (componentData3 != null && !TextUtils.isEmpty(componentData3.planName)) {
            this.k.setText(this.s.planName);
        }
        FetchComponentData.FetchModel.ComponentData componentData4 = this.s;
        if (componentData4 != null && !TextUtils.isEmpty(componentData4.networkName)) {
            this.l.setText(this.s.networkName);
        }
        FetchComponentData.FetchModel.ComponentData componentData5 = this.s;
        if (componentData5 == null || componentData5.phoneNumber == null || this.s.phoneNumber.selectNumType == 2) {
            this.e.setVisibility(8);
        } else {
            this.e.setVisibility(0);
            if (!TextUtils.isEmpty(this.s.phoneNumberName)) {
                this.m.setText(this.s.phoneNumberName);
            }
        }
        ContractNode.Version version = this.u;
        if (version != null && !TextUtils.isEmpty(version.secondJumpTitle)) {
            this.p.setText(this.u.secondJumpTitle);
        }
        k();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        com.taobao.android.detail.alicom.widget.a aVar = this.L;
        if (aVar != null) {
            aVar.a(l());
        }
        RemoteBusiness remoteBusiness = this.H;
        if (remoteBusiness != null) {
            remoteBusiness.cancelRequest();
        }
        dwe.a(this.f9333a, "Page_Contract", this.K ? "contractPhone" : TrtcConstants.TRTC_PARAMS_PHONE_NUMBER);
        super.onBackPressed();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.x = null;
        FetchComponentData.FetchModel.ComponentData componentData = this.s;
        if (componentData == null) {
            return;
        }
        if (componentData.plan != null && this.s.plan.size() > 0) {
            this.x = this.s.plan;
        } else if (this.s.planLite != null && this.s.planLite.size() > 0) {
            this.x = this.s.planLite;
        }
        FetchComponentData.FetchModel.ComponentData componentData2 = this.s;
        if (componentData2 != null && componentData2.area != null && this.s.area.size() != 0) {
            return;
        }
        this.F = this.x;
        f();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.w = null;
        FetchComponentData.FetchModel.ComponentData componentData = this.s;
        if (componentData != null) {
            this.w = componentData.network;
        }
        FetchComponentData.FetchModel.ComponentData componentData2 = this.s;
        if (componentData2 != null && componentData2.area != null && this.s.area.size() != 0) {
            return;
        }
        this.G = this.w;
        g();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.v = null;
        FetchComponentData.FetchModel.ComponentData componentData = this.s;
        if (componentData == null || componentData.area == null || this.s.area.size() == 0) {
            this.b.setVisibility(8);
            return;
        }
        this.b.setVisibility(0);
        this.v = new ArrayList();
        this.y = new ArrayList();
        for (int i = 0; i < this.s.area.size(); i++) {
            FetchComponentData.FetchModel.ComponentData.Area area = this.s.area.get(i);
            if (area != null && area.city != null) {
                for (int i2 = 0; i2 < area.city.size(); i2++) {
                    ContractCityInfo contractCityInfo = new ContractCityInfo();
                    contractCityInfo.city = area.city.get(i2);
                    contractCityInfo.provinceCode = area.code;
                    if ("true".equals(contractCityInfo.city.selected)) {
                        a(contractCityInfo);
                    }
                    String str = area.city.get(i2) != null ? area.city.get(i2).cityInitial : "";
                    if (str != null && str.matches("[A-Z]")) {
                        contractCityInfo.sortLetters = str;
                        if (!this.y.contains(str)) {
                            this.y.add(str);
                        }
                    }
                    this.v.add(contractCityInfo);
                }
            }
        }
        try {
            Comparator<ContractCityInfo> comparator = new Comparator<ContractCityInfo>() { // from class: com.taobao.android.detail.alicom.widget.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    b.this = this;
                }

                @Override // java.util.Comparator
                public /* synthetic */ int compare(ContractCityInfo contractCityInfo2, ContractCityInfo contractCityInfo3) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, contractCityInfo2, contractCityInfo3})).intValue() : a(contractCityInfo2, contractCityInfo3);
                }

                public int a(ContractCityInfo contractCityInfo2, ContractCityInfo contractCityInfo3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("3197753b", new Object[]{this, contractCityInfo2, contractCityInfo3})).intValue();
                    }
                    if (contractCityInfo2 != null && contractCityInfo2.sortLetters != null && contractCityInfo3 != null) {
                        return contractCityInfo2.sortLetters.compareTo(contractCityInfo3.sortLetters);
                    }
                    return 0;
                }
            };
            Collections.sort(this.y);
            Collections.sort(this.v, comparator);
        } catch (Exception unused) {
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        ContractSelectedRet contractSelectedRet = this.t;
        if (contractSelectedRet == null || this.u == null || contractSelectedRet.versionCode == null || !this.t.versionCode.equals(this.u.versionCode)) {
            return;
        }
        if (!TextUtils.isEmpty(this.t.cityName) && this.t.selectedCity != null) {
            a((ContractCityInfo) JSON.parseObject(this.t.selectedCity, ContractCityInfo.class));
        }
        if (!TextUtils.isEmpty(this.t.planName) && this.t.selectedPlan != null) {
            a((FetchComponentData.FetchModel.ComponentData.Plan) JSON.parseObject(this.t.selectedPlan, FetchComponentData.FetchModel.ComponentData.Plan.class));
        }
        if (!TextUtils.isEmpty(this.t.networkName) && this.t.selectedNetwork != null) {
            a((FetchComponentData.FetchModel.ComponentData.Network) JSON.parseObject(this.t.selectedNetwork, FetchComponentData.FetchModel.ComponentData.Network.class));
        }
        if (!TextUtils.isEmpty(this.t.phoneNumber) && !"号码随机".equals(this.t.phoneNumber)) {
            a(this.t.phoneNumber);
        }
        this.J = this.t.isSelectedComplete;
    }

    private void a(ContractCityInfo contractCityInfo) {
        List<FetchComponentData.FetchModel.ComponentData.Plan> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb8b567", new Object[]{this, contractCityInfo});
        } else if (contractCityInfo == null || this.B == null || contractCityInfo.city == null || this.B.city == null || contractCityInfo.city.code == null || !contractCityInfo.city.code.equals(this.B.city.code)) {
            this.J = false;
            this.B = contractCityInfo;
            ContractCityInfo contractCityInfo2 = this.B;
            if (contractCityInfo2 != null && contractCityInfo2.city != null) {
                this.f.setText(this.B.city.name);
                this.f.setTextColor(-16777216);
            }
            h();
            i();
            j();
            this.F = null;
            ContractCityInfo contractCityInfo3 = this.B;
            if (contractCityInfo3 != null && contractCityInfo3.city != null && this.B.city.planIds != null && (list = this.x) != null && list.size() > 0) {
                this.F = new ArrayList();
                for (String str : this.B.city.planIds) {
                    for (FetchComponentData.FetchModel.ComponentData.Plan plan : this.x) {
                        if (plan != null && str.equals(plan.planId)) {
                            this.F.add(plan);
                        }
                    }
                }
            }
            this.G = null;
            ContractCityInfo contractCityInfo4 = this.B;
            if (contractCityInfo4 != null && contractCityInfo4.city != null && this.B.city.network != null && this.w != null) {
                this.G = new ArrayList();
                for (String str2 : this.B.city.network) {
                    for (FetchComponentData.FetchModel.ComponentData.Network network : this.w) {
                        if (str2 != null && network != null && str2.equals(network.code)) {
                            this.G.add(network);
                        }
                    }
                }
            }
            f();
            g();
            k();
        }
    }

    private void a(FetchComponentData.FetchModel.ComponentData.Plan plan) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c93d11ae", new Object[]{this, plan});
        } else if (plan != null && plan.planId != null && this.C != null && plan.planId.equals(this.C.planId)) {
        } else {
            this.J = false;
            this.C = plan;
            FetchComponentData.FetchModel.ComponentData.Plan plan2 = this.C;
            if (plan2 != null) {
                this.g.setText(plan2.name);
                this.g.setTextColor(com.taobao.android.detail.sdk.utils.b.a("#000000"));
            }
            i();
            j();
            k();
        }
    }

    private void a(FetchComponentData.FetchModel.ComponentData.Network network) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51d408cb", new Object[]{this, network});
        } else if (network != null && network.code != null && this.D != null && network.code.equals(this.D)) {
        } else {
            this.J = false;
            this.D = network;
            FetchComponentData.FetchModel.ComponentData.Network network2 = this.D;
            if (network2 != null) {
                this.h.setText(network2.name);
                this.h.setTextColor(com.taobao.android.detail.sdk.utils.b.a("#000000"));
            }
            j();
            k();
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (str != null && str.equals(this.E)) {
        } else {
            this.J = false;
            this.E = str;
            if (!TextUtils.isEmpty(this.E)) {
                this.i.setText(dwf.a(this.E));
                this.i.setTextColor(-16777216);
            }
            k();
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        List<FetchComponentData.FetchModel.ComponentData.Plan> list = this.F;
        if (list == null || list.size() == 0) {
            this.c.setVisibility(8);
            return;
        }
        this.c.setVisibility(0);
        if (this.F.size() != 1 || this.F.get(0) == null) {
            return;
        }
        a(this.F.get(0));
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        List<FetchComponentData.FetchModel.ComponentData.Network> list = this.G;
        if (list == null || list.size() == 0) {
            this.d.setVisibility(8);
            return;
        }
        this.d.setVisibility(0);
        if (this.w.size() != 1 || this.G.get(0) == null) {
            return;
        }
        a(this.G.get(0));
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.C = null;
        this.g.setText("请选择");
        this.g.setTextColor(com.taobao.android.detail.sdk.utils.b.a("#cccccc"));
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        List<FetchComponentData.FetchModel.ComponentData.Network> list = this.w;
        if (list != null && list.size() == 1 && this.w.get(0) != null) {
            return;
        }
        this.D = null;
        this.h.setText("请选择");
        this.h.setTextColor(com.taobao.android.detail.sdk.utils.b.a("#cccccc"));
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.E = null;
        this.i.setText("请选择");
        this.i.setTextColor(com.taobao.android.detail.sdk.utils.b.a("#cccccc"));
    }

    private boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        if ((this.b.getVisibility() == 0 && this.B == null) || ((this.c.getVisibility() == 0 && this.C == null) || ((this.d.getVisibility() == 0 && this.D == null) || (this.e.getVisibility() == 0 && TextUtils.isEmpty(this.E))))) {
            this.n.setClickable(false);
            this.n.setBackgroundResource(R.drawable.detail_contractphone_gray_corners_bg);
            return false;
        }
        this.n.setClickable(true);
        this.n.setBackgroundResource(R.drawable.detail_contractphone_red_corners_bg);
        return true;
    }

    private ContractSelectedRet l() {
        String str;
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContractSelectedRet) ipChange.ipc$dispatch("ab9609e5", new Object[]{this});
        }
        ContractSelectedRet contractSelectedRet = new ContractSelectedRet();
        contractSelectedRet.isSelectedComplete = this.J;
        ContractNode.Version version = this.u;
        contractSelectedRet.versionCode = version == null ? null : version.versionCode;
        contractSelectedRet.selectedRetMap = new HashMap();
        FetchComponentData.FetchModel.ComponentData.Plan plan = this.C;
        if (plan != null) {
            str = plan.planId;
            contractSelectedRet.selectedPlan = JSON.toJSONString(this.C);
            contractSelectedRet.planName = this.C.name;
        } else {
            str = "0";
        }
        if (this.B != null) {
            str2 = str + "_" + this.B.provinceCode + "_" + this.B.city.code;
            contractSelectedRet.cityName = this.B.city.name;
            contractSelectedRet.selectedCity = JSON.toJSONString(this.B);
        } else {
            str2 = str + "_0_0";
        }
        if (!TextUtils.isEmpty(this.E) && !"号码随机".equals(this.E)) {
            str3 = str2 + "_" + this.E;
            contractSelectedRet.phoneNumber = this.E;
        } else {
            str3 = str2 + "_0";
            if (!this.K && this.e.getVisibility() == 8) {
                contractSelectedRet.phoneNumber = "号码随机";
            }
        }
        if (this.D != null) {
            str4 = str3 + "_" + this.D.code;
            contractSelectedRet.networkName = this.D.name;
            contractSelectedRet.selectedNetwork = JSON.toJSONString(this.D);
        } else {
            str4 = str3 + "_0";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        sb.append("_0_");
        ContractNode.Version version2 = this.u;
        sb.append(version2 == null ? 0 : version2.versionCode);
        contractSelectedRet.selectedRetMap.put("alicom_wtt_param", sb.toString());
        if (this.u.noShopCart) {
            contractSelectedRet.selectedRetMap.put("alicom_wtt_cart", "0");
        } else {
            contractSelectedRet.selectedRetMap.put("alicom_wtt_cart", "1");
        }
        return contractSelectedRet;
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        TBCircularProgress tBCircularProgress = this.r;
        if (tBCircularProgress == null) {
            return;
        }
        tBCircularProgress.setVisibility(0);
        this.q.setVisibility(0);
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        TBCircularProgress tBCircularProgress = this.r;
        if (tBCircularProgress == null) {
            return;
        }
        tBCircularProgress.setVisibility(8);
        this.q.setVisibility(8);
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        if (this.I == null) {
            this.I = new RemoteBusinessListener() { // from class: com.taobao.android.detail.alicom.widget.PhoneNumSalePlanView$4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    } else if (baseOutDo == null || !(baseOutDo instanceof PreholdingPhoneNumberResult)) {
                        onFail(i, mtopResponse, obj);
                    } else {
                        PreholdingPhoneNumberData mo2429getData = ((PreholdingPhoneNumberResult) baseOutDo).mo2429getData();
                        b.v(b.this);
                        if (mo2429getData == null) {
                            return;
                        }
                        if (PreholdingPhoneNumberData.PRE_SUCCESS.equals(mo2429getData.errorCode)) {
                            b.a(b.this, true);
                            b.this.onBackPressed();
                        } else if (!TextUtils.isEmpty(mo2429getData.errorMsg)) {
                            Toast.makeText(b.this.getContext(), mo2429getData.errorMsg, 0).show();
                        } else {
                            Toast.makeText(b.this.getContext(), "预占号码失败~", 0).show();
                        }
                    }
                }

                @Override // com.taobao.android.detail.alicom.mtop.RemoteBusinessListener
                public void onFail(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("99b5aac0", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    b.v(b.this);
                    try {
                        JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                        if (dataJsonObject == null) {
                            return;
                        }
                        Toast.makeText(b.this.getContext(), ((PreholdingPhoneNumberData) JSON.parseObject(dataJsonObject.toString(), PreholdingPhoneNumberData.class)).errorMsg, 0).show();
                    } catch (Exception unused) {
                        Toast.makeText(b.this.getContext(), "网络异常，请稍后重试~", 0).show();
                    }
                }
            };
        }
        m();
        RemoteBusiness remoteBusiness = this.H;
        if (remoteBusiness != null) {
            remoteBusiness.cancelRequest();
        }
        ContractCityInfo contractCityInfo = this.B;
        String str2 = "";
        String str3 = (contractCityInfo == null || contractCityInfo.city == null) ? str2 : this.B.city.code;
        ContractCityInfo contractCityInfo2 = this.B;
        String str4 = contractCityInfo2 == null ? str2 : contractCityInfo2.provinceCode;
        String str5 = this.A;
        FetchComponentData.FetchModel.ComponentData.Plan plan = this.C;
        String str6 = plan == null ? str2 : plan.planId;
        String str7 = this.z;
        ContractNode.Version version = this.u;
        if (version != null) {
            str2 = version.versionCode;
        }
        this.H = com.taobao.android.detail.alicom.mtop.a.a(str, str3, str4, str5, str6, str7, str2, this.I);
    }

    /* loaded from: classes4.dex */
    public class a extends Dialog {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Activity b;
        private TextView c;
        private ListView d;
        private TextView e;
        private PhonenumSideBar f;
        private ImageView g;
        private PhonenumCityAdapter h;
        private List<ContractCityInfo> i;
        private List<String> j;
        private int k;
        private String l;

        static {
            kge.a(1032026236);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -641568046) {
                super.onCreate((Bundle) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ PhonenumCityAdapter a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PhonenumCityAdapter) ipChange.ipc$dispatch("f9115756", new Object[]{aVar}) : aVar.h;
        }

        public static /* synthetic */ ListView b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ListView) ipChange.ipc$dispatch("f434cf26", new Object[]{aVar}) : aVar.d;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity, String str, List<ContractCityInfo> list, List<String> list2, ContractCityInfo contractCityInfo) {
            super(activity, 16973840);
            b.this = r1;
            this.k = -1;
            this.b = activity;
            this.i = list;
            this.j = list2;
            this.k = a(contractCityInfo);
            this.l = str;
        }

        private int a(ContractCityInfo contractCityInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fb8b55a", new Object[]{this, contractCityInfo})).intValue();
            }
            if (contractCityInfo == null || contractCityInfo.city == null || this.i == null) {
                return -1;
            }
            for (int i = 0; i < this.i.size(); i++) {
                if (this.i.get(i) != null && this.i.get(i).city != null && contractCityInfo.city != null && contractCityInfo.city.code != null && contractCityInfo.city.code.equals(this.i.get(i).city.code)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
                return;
            }
            super.onCreate(bundle);
            getWindow().setSoftInputMode(35);
            getWindow().setWindowAnimations(16973826);
            setContentView(R.layout.detail_phonenum_city_dialog);
            this.c = (TextView) findViewById(R.id.detail_phonenumber_area_dialog_title_tv);
            this.d = (ListView) findViewById(R.id.detail_phonenumber_area_list);
            this.e = (TextView) findViewById(R.id.detail_phonenumber_area_letter_text);
            this.f = (PhonenumSideBar) findViewById(R.id.detail_phonenumber_area_letter_sidebar);
            this.g = (ImageView) findViewById(R.id.detail_phonenumber_area_back_iv);
            if (!TextUtils.isEmpty(this.l)) {
                this.c.setText(this.l);
            }
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.taobao.android.detail.alicom.widget.b.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (view.getId() != R.id.detail_phonenumber_area_back_iv) {
                    } else {
                        a.this.dismiss();
                    }
                }
            };
            PhonenumSideBar.a aVar = new PhonenumSideBar.a() { // from class: com.taobao.android.detail.alicom.widget.b.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                @Override // com.taobao.android.detail.alicom.view.PhonenumSideBar.a
                public void a(String str) {
                    int positionForSection;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    } else if (a.a(a.this) == null || TextUtils.isEmpty(str) || (positionForSection = a.a(a.this).getPositionForSection(str.charAt(0))) == -1) {
                    } else {
                        a.b(a.this).setSelection(positionForSection);
                    }
                }
            };
            this.d.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.taobao.android.detail.alicom.widget.PhoneNumSalePlanView$SelectCityDialog$3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i), new Long(j)});
                        return;
                    }
                    b.a.a(b.a.this).setSelectItem(i);
                    b.a.a(b.a.this).notifyDataSetInvalidated();
                    b.a(b.this, b.a.a(b.a.this).mo839getItem(i));
                    b.a.this.dismiss();
                }
            });
            this.f.setOnTouchingLetterChangedListener(aVar);
            this.g.setOnClickListener(onClickListener);
            this.f.setTextView(this.e);
            this.f.setIndexText(this.j);
            this.h = new PhonenumCityAdapter(this.b, this.i);
            this.d.setAdapter((ListAdapter) this.h);
            int i = this.k;
            if (i == -1) {
                return;
            }
            this.h.setSelectItem(i);
            this.h.notifyDataSetChanged();
        }
    }

    /* loaded from: classes4.dex */
    public class d extends Dialog {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Activity b;
        private List<FetchComponentData.FetchModel.ComponentData.Plan> c;
        private TextView d;
        private ListView e;
        private ImageView f;
        private TextView g;
        private PhonenumPlanAdapter h;
        private int i;
        private String j;

        static {
            kge.a(1718657978);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == -641568046) {
                super.onCreate((Bundle) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ PhonenumPlanAdapter a(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PhonenumPlanAdapter) ipChange.ipc$dispatch("849f1317", new Object[]{dVar}) : dVar.h;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Activity activity, String str, List<FetchComponentData.FetchModel.ComponentData.Plan> list, FetchComponentData.FetchModel.ComponentData.Plan plan) {
            super(activity, 16973840);
            b.this = r1;
            this.i = -1;
            this.b = activity;
            this.c = list;
            this.j = str;
            this.i = a(plan);
        }

        private int a(FetchComponentData.FetchModel.ComponentData.Plan plan) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c93d11a1", new Object[]{this, plan})).intValue();
            }
            if (plan == null || plan.planId == null || this.c == null) {
                return -1;
            }
            for (int i = 0; i < this.c.size(); i++) {
                if (this.c.get(i) != null && plan.planId != null && plan.planId.equals(this.c.get(i).planId)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
                return;
            }
            super.onCreate(bundle);
            getWindow().setSoftInputMode(35);
            getWindow().setWindowAnimations(16973826);
            setContentView(R.layout.detail_phonenum_plan_dialog);
            this.d = (TextView) findViewById(R.id.detail_phonenumber_plan_dialog_title_tv);
            this.e = (ListView) findViewById(R.id.detail_phonenumber_plan_list);
            this.f = (ImageView) findViewById(R.id.detail_phonenumber_plan_back_iv);
            this.g = (TextView) findViewById(R.id.detail_phonenumber_plan_descrip_tv);
            if (!TextUtils.isEmpty(this.j)) {
                this.d.setText(this.j);
            }
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.taobao.android.detail.alicom.widget.b.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    d.this = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (view.getId() != R.id.detail_phonenumber_plan_back_iv) {
                    } else {
                        d.this.dismiss();
                    }
                }
            };
            AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() { // from class: com.taobao.android.detail.alicom.widget.PhoneNumSalePlanView$SelectPlanDialog$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i), new Long(j)});
                        return;
                    }
                    b.a(b.this, b.d.a(b.d.this).mo842getItem(i));
                    b.d.this.dismiss();
                }
            };
            this.f.setOnClickListener(onClickListener);
            this.e.setOnItemClickListener(onItemClickListener);
            this.h = new PhonenumPlanAdapter(this.c, this.b);
            this.e.setAdapter((ListAdapter) this.h);
            int i = this.i;
            if (i == -1) {
                return;
            }
            this.h.setSelectItem(i);
            this.h.notifyDataSetChanged();
            List<FetchComponentData.FetchModel.ComponentData.Plan> list = this.c;
            if (list != null && list.get(this.i) != null && !TextUtils.isEmpty(this.c.get(this.i).contractDesc)) {
                TextView textView = this.g;
                textView.setText("温馨提示：" + this.c.get(this.i).contractDesc);
                return;
            }
            this.g.setText("");
        }
    }

    /* renamed from: com.taobao.android.detail.alicom.widget.b$b */
    /* loaded from: classes4.dex */
    public class DialogC0362b extends Dialog {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Activity b;
        private TextView c;
        private ImageView d;
        private ListView e;
        private List<FetchComponentData.FetchModel.ComponentData.Network> f;
        private PhonenumNetworkAdapter g;
        private String h;
        private int i;

        static {
            kge.a(-109460851);
        }

        public static /* synthetic */ Object ipc$super(DialogC0362b dialogC0362b, String str, Object... objArr) {
            if (str.hashCode() == -641568046) {
                super.onCreate((Bundle) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ PhonenumNetworkAdapter a(DialogC0362b dialogC0362b) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PhonenumNetworkAdapter) ipChange.ipc$dispatch("ab3d111a", new Object[]{dialogC0362b}) : dialogC0362b.g;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogC0362b(Activity activity, String str, List<FetchComponentData.FetchModel.ComponentData.Network> list, FetchComponentData.FetchModel.ComponentData.Network network) {
            super(activity, 16973840);
            b.this = r1;
            this.i = -1;
            this.b = activity;
            this.h = str;
            this.f = list;
            this.i = a(network);
        }

        private int a(FetchComponentData.FetchModel.ComponentData.Network network) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("51d408be", new Object[]{this, network})).intValue();
            }
            if (network == null || network.code == null || this.f == null) {
                return -1;
            }
            for (int i = 0; i < this.f.size(); i++) {
                if (this.f.get(i) != null && network.code.equals(this.f.get(i).code)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
                return;
            }
            super.onCreate(bundle);
            getWindow().setSoftInputMode(35);
            getWindow().setWindowAnimations(16973826);
            setContentView(R.layout.detail_phonenum_network_dialog);
            this.c = (TextView) findViewById(R.id.detail_phonenumber_network_dialog_title_tv);
            this.d = (ImageView) findViewById(R.id.detail_phonenumber_network_back_iv);
            this.e = (ListView) findViewById(R.id.detail_phonenumber_network_list);
            if (!TextUtils.isEmpty(this.h)) {
                this.c.setText(this.h);
            }
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.taobao.android.detail.alicom.widget.b.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    DialogC0362b.this = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (view.getId() != R.id.detail_phonenumber_network_back_iv) {
                    } else {
                        DialogC0362b.this.dismiss();
                    }
                }
            };
            AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() { // from class: com.taobao.android.detail.alicom.widget.PhoneNumSalePlanView$SelectNetworkDialog$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i), new Long(j)});
                        return;
                    }
                    b.a(b.this, b.DialogC0362b.a(b.DialogC0362b.this).mo840getItem(i));
                    b.DialogC0362b.this.dismiss();
                }
            };
            this.d.setOnClickListener(onClickListener);
            this.e.setOnItemClickListener(onItemClickListener);
            this.g = new PhonenumNetworkAdapter(this.b, this.f);
            this.e.setAdapter((ListAdapter) this.g);
            int i = this.i;
            if (i == -1) {
                return;
            }
            this.g.setSelectItem(i);
            this.g.notifyDataSetChanged();
        }
    }

    /* loaded from: classes4.dex */
    public class c extends Dialog {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Activity b;
        private TextView c;
        private ImageView d;
        private EditText e;
        private TextView f;
        private GridView g;
        private TextView h;
        private TextView i;
        private View j;
        private TBCircularProgress k;
        private PhonenumNumberAdapter l;
        private RemoteBusiness m;
        private RemoteBusinessListener n;
        private String o;
        private String p;
        private String q;
        private String r;
        private String s;
        private String t;
        private String u;
        private String v;
        private String w;
        private boolean x;

        static {
            kge.a(1210811802);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -641568046) {
                super.onCreate((Bundle) objArr[0]);
                return null;
            } else if (hashCode != 143326307) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onBackPressed();
                return null;
            }
        }

        public static /* synthetic */ int a(c cVar, List list, String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("efca6310", new Object[]{cVar, list, str})).intValue() : cVar.a(list, str);
        }

        public static /* synthetic */ void a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e2def22", new Object[]{cVar});
            } else {
                cVar.c();
            }
        }

        public static /* synthetic */ void a(c cVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f196546c", new Object[]{cVar, str});
            } else {
                cVar.c(str);
            }
        }

        public static /* synthetic */ int b(c cVar, String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8e0450be", new Object[]{cVar, str})).intValue() : cVar.b(str);
        }

        public static /* synthetic */ EditText b(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (EditText) ipChange.ipc$dispatch("af75ea70", new Object[]{cVar}) : cVar.e;
        }

        public static /* synthetic */ int c(c cVar, String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2a724d1d", new Object[]{cVar, str})).intValue() : cVar.a(str);
        }

        public static /* synthetic */ TextView c(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("fb65c3d4", new Object[]{cVar}) : cVar.i;
        }

        public static /* synthetic */ PhonenumNumberAdapter d(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PhonenumNumberAdapter) ipChange.ipc$dispatch("f79d84f9", new Object[]{cVar}) : cVar.l;
        }

        public static /* synthetic */ boolean e(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("24d487a2", new Object[]{cVar})).booleanValue() : cVar.x;
        }

        public static /* synthetic */ void f(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("167e2dbd", new Object[]{cVar});
            } else {
                cVar.b();
            }
        }

        public static /* synthetic */ TextView g(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("6529a850", new Object[]{cVar}) : cVar.h;
        }

        public static /* synthetic */ TextView h(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("7f9aa16f", new Object[]{cVar}) : cVar.f;
        }

        public static /* synthetic */ String i(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9633cbc6", new Object[]{cVar}) : cVar.w;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            super(activity, 16973840);
            b.this = r1;
            this.x = true;
            this.b = activity;
            this.o = str;
            this.p = str3;
            this.q = str4;
            this.r = str5;
            this.w = str2;
            this.t = str7;
            this.u = str8;
            this.v = str9;
            this.s = str6;
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
                return;
            }
            super.onCreate(bundle);
            getWindow().setSoftInputMode(35);
            getWindow().setWindowAnimations(16973826);
            setContentView(R.layout.detail_phonenum_number_dialog);
            this.c = (TextView) findViewById(R.id.detail_phonenumber_phone_dialog_title_tv);
            this.d = (ImageView) findViewById(R.id.detail_phonenumber_phone_back_iv);
            this.e = (EditText) findViewById(R.id.detail_phonenumber_number_ed);
            this.f = (TextView) findViewById(R.id.detail_phonenumber_number_empty_tv);
            this.g = (GridView) findViewById(R.id.detail_phonenumber_number_gv);
            this.h = (TextView) findViewById(R.id.detail_phonenumber_number_refush_btn);
            this.i = (TextView) findViewById(R.id.detail_phonenumber_number_search_bn);
            this.j = findViewById(R.id.detail_phonenumber_number_mask);
            this.k = (TBCircularProgress) findViewById(R.id.detail_phonenumber_number_query_progressBar);
            if (!TextUtils.isEmpty(this.o)) {
                this.c.setText(this.o);
            }
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.taobao.android.detail.alicom.widget.b.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    c.this = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TextView c;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (view.getId() == R.id.detail_phonenumber_phone_back_iv) {
                        c.this.onBackPressed();
                    } else if (view.getId() == R.id.detail_phonenumber_number_refush_btn) {
                        c.a(c.this);
                        c cVar = c.this;
                        c.a(cVar, c.b(cVar).getText().toString().replace(" ", ""));
                    } else if (view.getId() != R.id.detail_phonenumber_number_search_bn) {
                    } else {
                        String str = "关闭";
                        if (!str.equals(c.c(c.this).getText().toString())) {
                            if (!TextUtils.isEmpty(c.b(c.this).getText())) {
                                c = c.c(c.this);
                            }
                            c.a(c.this);
                            c cVar2 = c.this;
                            c.a(cVar2, c.b(cVar2).getText().toString().replace(" ", ""));
                        }
                        c.b(c.this).setText("");
                        c = c.c(c.this);
                        str = "搜索";
                        c.setText(str);
                        c.a(c.this);
                        c cVar22 = c.this;
                        c.a(cVar22, c.b(cVar22).getText().toString().replace(" ", ""));
                    }
                }
            };
            AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() { // from class: com.taobao.android.detail.alicom.widget.PhoneNumSalePlanView$SelectNumberDialog$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i), new Long(j)});
                        return;
                    }
                    String str = b.c.d(b.c.this).mo841getItem(i) != null ? b.c.d(b.c.this).mo841getItem(i).phoneNum : "";
                    if (b.c.d(b.c.this) != null && !TextUtils.isEmpty(str)) {
                        b.b(b.this, str);
                        b.c.this.onBackPressed();
                    }
                    b.c.a(b.c.this);
                }
            };
            TextWatcher textWatcher = new TextWatcher() { // from class: com.taobao.android.detail.alicom.widget.b.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                    }
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                    }
                }

                {
                    c.this = this;
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                        return;
                    }
                    Editable editableText = c.b(c.this).getEditableText();
                    if ((i == 3 || i == 8) && i3 == 0 && i2 == 1) {
                        editableText.delete(i - 1, i);
                        return;
                    }
                    int b = c.b(c.this, editableText.toString());
                    if (b == 1) {
                        int c = c.c(c.this, editableText.toString());
                        editableText.delete(c, c + 1);
                    } else if (b == 2) {
                        editableText.insert(3, String.valueOf(' '));
                    } else if (b == 3) {
                        editableText.insert(8, String.valueOf(' '));
                    } else if (b != 4) {
                    } else {
                        editableText.delete(editableText.length() - 1, editableText.length());
                    }
                }
            };
            View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: com.taobao.android.detail.alicom.widget.b.c.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    c.this = this;
                }

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                    }
                    return true;
                }
            };
            this.d.setOnClickListener(onClickListener);
            this.h.setOnClickListener(onClickListener);
            this.i.setOnClickListener(onClickListener);
            this.e.addTextChangedListener(textWatcher);
            this.g.setOnItemClickListener(onItemClickListener);
            this.j.setOnTouchListener(onTouchListener);
            this.g.setEmptyView(this.f);
            this.l = new PhonenumNumberAdapter(this.b, null);
            this.g.setAdapter((ListAdapter) this.l);
            c(this.e.getText().toString().replace(" ", ""));
        }

        private int a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
            }
            if (str == null) {
                return -1;
            }
            for (int i = 0; i < str.length(); i++) {
                if (i != 3 && i != 8 && str.charAt(i) == ' ') {
                    return i;
                }
            }
            return -1;
        }

        private int b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{this, str})).intValue();
            }
            if (str == null) {
                return -1;
            }
            if (a(str) != -1) {
                return 1;
            }
            if (str.length() > 3 && str.charAt(3) != ' ') {
                return 2;
            }
            if (str.length() > 8 && str.charAt(8) != ' ') {
                return 3;
            }
            return str.length() > 13 ? 4 : 0;
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            TBCircularProgress tBCircularProgress = this.k;
            if (tBCircularProgress == null) {
                return;
            }
            tBCircularProgress.setVisibility(0);
            this.j.setVisibility(0);
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            TBCircularProgress tBCircularProgress = this.k;
            if (tBCircularProgress == null) {
                return;
            }
            tBCircularProgress.setVisibility(8);
            this.j.setVisibility(8);
        }

        private void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (inputMethodManager == null) {
                return;
            }
            inputMethodManager.hideSoftInputFromWindow(this.e.getWindowToken(), 0);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88afc63", new Object[]{this});
                return;
            }
            RemoteBusiness remoteBusiness = this.m;
            if (remoteBusiness != null) {
                remoteBusiness.cancelRequest();
            }
            this.x = false;
            super.onBackPressed();
        }

        private int a(List<QueryContractPhoneNumberData.PhoneNumberList> list, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3c6e0ed6", new Object[]{this, list, str})).intValue();
            }
            if (list == null || TextUtils.isEmpty(str)) {
                return -1;
            }
            for (int i = 0; i < list.size(); i++) {
                if (str.equals(list.get(i).phoneNum)) {
                    return i;
                }
            }
            return -1;
        }

        private void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
                return;
            }
            if (this.n == null) {
                this.n = new RemoteBusinessListener() { // from class: com.taobao.android.detail.alicom.widget.PhoneNumSalePlanView$SelectNumberDialog$5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        } else if (!b.c.e(b.c.this)) {
                        } else {
                            if (baseOutDo == null || !(baseOutDo instanceof QueryContractPhoneNumberResult)) {
                                onFail(i, mtopResponse, obj);
                                return;
                            }
                            QueryContractPhoneNumberData mo2429getData = ((QueryContractPhoneNumberResult) baseOutDo).mo2429getData();
                            b.c.f(b.c.this);
                            if (mo2429getData != null) {
                                if (mo2429getData.module != null && mo2429getData.module.size() > 0 && mo2429getData.module.get(0) != null && !TextUtils.isEmpty(mo2429getData.module.get(0).phoneNum)) {
                                    if (mo2429getData.module.size() < 20) {
                                        b.c.g(b.c.this).setVisibility(8);
                                    } else {
                                        b.c.g(b.c.this).setVisibility(0);
                                    }
                                    b.c.d(b.c.this).update(mo2429getData.module);
                                } else {
                                    b.c.g(b.c.this).setVisibility(8);
                                    b.c.d(b.c.this).update(null);
                                    if (!TextUtils.isEmpty(mo2429getData.errorMsg)) {
                                        b.c.h(b.c.this).setText(mo2429getData.errorMsg);
                                    } else if (!TextUtils.isEmpty(b.c.b(b.c.this).getText().toString())) {
                                        b.c.h(b.c.this).setText("亲！好可惜，没有找到匹配的号码噢");
                                    } else {
                                        b.c.h(b.c.this).setText("号码被抢光了，请尝试更换套餐、制式或者地区再查找号码吧。");
                                    }
                                }
                                b.c.d(b.c.this).setSelectItem(b.c.a(b.c.this, mo2429getData.module, b.c.i(b.c.this)));
                                b.c.d(b.c.this).notifyDataSetChanged();
                                return;
                            }
                            b.c.g(b.c.this).setVisibility(8);
                        }
                    }

                    @Override // com.taobao.android.detail.alicom.mtop.RemoteBusinessListener
                    public void onFail(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("99b5aac0", new Object[]{this, new Integer(i), mtopResponse, obj});
                        } else if (!b.c.e(b.c.this)) {
                        } else {
                            b.c.f(b.c.this);
                            Toast.makeText(b.c.this.getContext(), "网络异常，请稍后重试~", 0).show();
                        }
                    }
                };
            }
            a();
            RemoteBusiness remoteBusiness = this.m;
            if (remoteBusiness != null) {
                remoteBusiness.cancelRequest();
            }
            com.taobao.android.detail.alicom.mtop.a.a(str, this.t, this.u, this.q, this.v, this.p, "20", this.s, this.n);
        }
    }
}
