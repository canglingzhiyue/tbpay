package com.taobao.tao.longpic;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.longpic.ShareNewQRCodeView;
import com.taobao.taobao.R;
import com.ut.share.data.ShareData;
import java.util.ArrayList;
import tb.kge;
import tb.nyq;

/* loaded from: classes8.dex */
public class SnapshotTargetView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ShareNewQRCodeView.b.a clickListener;
    private Context mContext;
    private b mListener;
    private ArrayList<com.taobao.share.globalmodel.a> mNativeTargets;
    private ShareData mShareData;
    private View view;

    /* loaded from: classes8.dex */
    public interface b {
        void a(String str, ShareData shareData);
    }

    static {
        kge.a(-2041282437);
    }

    public static /* synthetic */ Object ipc$super(SnapshotTargetView snapshotTargetView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ b access$000(SnapshotTargetView snapshotTargetView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("a8e97ba7", new Object[]{snapshotTargetView}) : snapshotTargetView.mListener;
    }

    public static /* synthetic */ ShareData access$100(SnapshotTargetView snapshotTargetView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShareData) ipChange.ipc$dispatch("95fb1669", new Object[]{snapshotTargetView}) : snapshotTargetView.mShareData;
    }

    public SnapshotTargetView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.clickListener = new ShareNewQRCodeView.b.a() { // from class: com.taobao.tao.longpic.SnapshotTargetView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.longpic.ShareNewQRCodeView.b.a
            public void a(com.taobao.share.globalmodel.a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2c8e9042", new Object[]{this, aVar});
                } else if (SnapshotTargetView.access$000(SnapshotTargetView.this) == null) {
                } else {
                    SnapshotTargetView.access$000(SnapshotTargetView.this).a(aVar.c(), SnapshotTargetView.access$100(SnapshotTargetView.this));
                }
            }
        };
        init(context);
    }

    public SnapshotTargetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.clickListener = new ShareNewQRCodeView.b.a() { // from class: com.taobao.tao.longpic.SnapshotTargetView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.longpic.ShareNewQRCodeView.b.a
            public void a(com.taobao.share.globalmodel.a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2c8e9042", new Object[]{this, aVar});
                } else if (SnapshotTargetView.access$000(SnapshotTargetView.this) == null) {
                } else {
                    SnapshotTargetView.access$000(SnapshotTargetView.this).a(aVar.c(), SnapshotTargetView.access$100(SnapshotTargetView.this));
                }
            }
        };
        init(context);
    }

    public SnapshotTargetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.clickListener = new ShareNewQRCodeView.b.a() { // from class: com.taobao.tao.longpic.SnapshotTargetView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.longpic.ShareNewQRCodeView.b.a
            public void a(com.taobao.share.globalmodel.a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2c8e9042", new Object[]{this, aVar});
                } else if (SnapshotTargetView.access$000(SnapshotTargetView.this) == null) {
                } else {
                    SnapshotTargetView.access$000(SnapshotTargetView.this).a(aVar.c(), SnapshotTargetView.access$100(SnapshotTargetView.this));
                }
            }
        };
        init(context);
    }

    public SnapshotTargetView(Context context) {
        super(context);
        this.clickListener = new ShareNewQRCodeView.b.a() { // from class: com.taobao.tao.longpic.SnapshotTargetView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.longpic.ShareNewQRCodeView.b.a
            public void a(com.taobao.share.globalmodel.a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2c8e9042", new Object[]{this, aVar});
                } else if (SnapshotTargetView.access$000(SnapshotTargetView.this) == null) {
                } else {
                    SnapshotTargetView.access$000(SnapshotTargetView.this).a(aVar.c(), SnapshotTargetView.access$100(SnapshotTargetView.this));
                }
            }
        };
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.mContext = context;
        this.view = LayoutInflater.from(context).inflate(R.layout.share_snapshot_target_view, this);
    }

    public void setData(b bVar, ArrayList<com.taobao.share.globalmodel.a> arrayList, ShareData shareData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4155a5e", new Object[]{this, bVar, arrayList, shareData, new Boolean(z)});
        } else if (bVar == null) {
        } else {
            this.mListener = bVar;
            this.mNativeTargets = arrayList;
            this.mShareData = shareData;
            if (z) {
                com.taobao.share.globalmodel.a aVar = new com.taobao.share.globalmodel.a();
                aVar.a(R.string.uik_icon_down);
                aVar.c(1);
                aVar.c(com.alibaba.ability.localization.b.a(R.string.share_app_save));
                aVar.d(com.taobao.umipublish.draft.b.ACTION_TYPE_SAVE);
                aVar.b(-1);
                this.mNativeTargets.add(aVar);
            }
            showView();
        }
    }

    public void setData(b bVar, ArrayList<com.taobao.share.globalmodel.a> arrayList, ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26533f36", new Object[]{this, bVar, arrayList, shareData});
        } else {
            setData(bVar, arrayList, shareData, true);
        }
    }

    private void showView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146cd6c9", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = (RecyclerView) this.view.findViewById(R.id.snapshot_target_native);
        ArrayList<com.taobao.share.globalmodel.a> arrayList = this.mNativeTargets;
        if (arrayList != null && arrayList.size() > 0) {
            recyclerView.removeAllViews();
            a aVar = new a(this.mContext.getApplicationContext(), getWindowWidth(), nyq.a(this.mContext, 69.0f), this.mNativeTargets.size());
            aVar.setOrientation(0);
            recyclerView.setLayoutManager(aVar);
            ShareNewQRCodeView.b bVar = new ShareNewQRCodeView.b(this.mContext.getApplicationContext(), this.mNativeTargets);
            recyclerView.setAdapter(bVar);
            bVar.a(this.clickListener);
            recyclerView.setVisibility(0);
            return;
        }
        recyclerView.setVisibility(8);
    }

    private int getWindowWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5ca3e2fa", new Object[]{this})).intValue() : ((WindowManager) this.mContext.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window)).getDefaultDisplay().getWidth();
    }

    /* loaded from: classes8.dex */
    public static class a extends LinearLayoutManager {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f20741a;
        private int b;
        private int c;

        static {
            kge.a(-1287869518);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 286693884) {
                return new Integer(super.getPaddingLeft());
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(Context context, int i, int i2, int i3) {
            super(context);
            this.f20741a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // android.support.v7.widget.RecyclerView.LayoutManager
        public int getPaddingLeft() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("111699fc", new Object[]{this})).intValue();
            }
            int i = this.b * this.c;
            int i2 = this.f20741a;
            if (i >= i2) {
                return super.getPaddingLeft();
            }
            return Math.round((i2 / 2.0f) - (i / 2.0f));
        }

        @Override // android.support.v7.widget.RecyclerView.LayoutManager
        public int getPaddingRight() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4f2526fb", new Object[]{this})).intValue() : getPaddingLeft();
        }
    }
}
