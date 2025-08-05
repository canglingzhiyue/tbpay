package com.taobao.taobao.scancode.barcode.business;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taobao.scancode.barcode.object.recommend.GetQRMedicineUrlRequest;
import com.taobao.taobao.scancode.barcode.object.recommend.GetQRMedicineUrlResponse;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.oxy;
import tb.oys;

/* loaded from: classes8.dex */
public class GetQRMedicineUrlBussiness implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private b handleMedicineListener;
    private String rowkey;

    /* loaded from: classes8.dex */
    public interface b {
        void a();

        void a(String str);
    }

    static {
        kge.a(-522053882);
        kge.a(-525336021);
    }

    public static /* synthetic */ String access$100(GetQRMedicineUrlBussiness getQRMedicineUrlBussiness) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c3c5f47d", new Object[]{getQRMedicineUrlBussiness}) : getQRMedicineUrlBussiness.rowkey;
    }

    public GetQRMedicineUrlBussiness() {
        this.rowkey = null;
    }

    public GetQRMedicineUrlBussiness(b bVar, String str) {
        this.rowkey = null;
        this.handleMedicineListener = bVar;
        this.rowkey = str;
    }

    public void handleMedicine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c08df409", new Object[]{this});
        } else if (this.handleMedicineListener == null) {
        } else {
            if (!GetQRMedicineUrlRequest.isQRMedicneCode(this.rowkey)) {
                this.handleMedicineListener.a();
                return;
            }
            new a().execute(new Void[0]);
            oys.a().a("Medicine_REQ_QR_handleMedicine");
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            this.handleMedicineListener.a();
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else if (baseOutDo == null) {
            this.handleMedicineListener.a();
        } else {
            GetQRMedicineUrlResponse getQRMedicineUrlResponse = (GetQRMedicineUrlResponse) baseOutDo;
            if (getQRMedicineUrlResponse.mo2429getData() == null) {
                this.handleMedicineListener.a();
            } else {
                this.handleMedicineListener.a(getQRMedicineUrlResponse.mo2429getData().getResult());
            }
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            this.handleMedicineListener.a();
        }
    }

    /* loaded from: classes8.dex */
    public class a extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(417441858);
        }

        private a() {
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Void doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        public Void a(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
            }
            GetQRMedicineUrlRequest getQRMedicineUrlRequest = new GetQRMedicineUrlRequest();
            getQRMedicineUrlRequest.rowkey = GetQRMedicineUrlBussiness.access$100(GetQRMedicineUrlBussiness.this);
            RemoteBusiness registeListener = RemoteBusiness.build(Globals.getApplication(), getQRMedicineUrlRequest, oxy.a(Globals.getApplication())).registeListener((MtopListener) GetQRMedicineUrlBussiness.this);
            registeListener.mo1335useWua();
            registeListener.startRequest(0, GetQRMedicineUrlResponse.class);
            return null;
        }
    }
}
