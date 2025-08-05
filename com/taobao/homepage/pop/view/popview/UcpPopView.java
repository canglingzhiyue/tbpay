package com.taobao.homepage.pop.view.popview;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.ucp.b;
import com.taobao.homepage.pop.ucp.c;
import tb.kyu;
import tb.laj;

/* loaded from: classes7.dex */
public class UcpPopView extends BasePopView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public b mUCPSignal;

    public static /* synthetic */ Object ipc$super(UcpPopView ucpPopView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1673753583) {
            super.onHandlePopViewEvent(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode != 502967273) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onHandlePopViewMessage((String) objArr[0]);
            return null;
        }
    }

    public UcpPopView(Context context, IPopData iPopData, laj lajVar, com.taobao.homepage.pop.view.container.a aVar, kyu kyuVar, b bVar) {
        super(context, iPopData, lajVar, aVar, kyuVar);
        this.mUCPSignal = bVar;
    }

    @Override // com.taobao.homepage.pop.view.popview.BasePopView
    public void onHandlePopViewMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dfaabe9", new Object[]{this, str});
            return;
        }
        super.onHandlePopViewMessage(str);
        notifyUCPStateIfNeed(str);
    }

    @Override // com.taobao.homepage.pop.view.popview.BasePopView
    public void onHandlePopViewEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c3c8c11", new Object[]{this, new Integer(i)});
            return;
        }
        super.onHandlePopViewEvent(i);
        notifyUCPStateIfNeed(i);
    }

    private void notifyUCPStateIfNeed(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42943a3c", new Object[]{this, str});
        } else if (this.mUCPSignal == null) {
        } else {
            char c = 65535;
            switch (str.hashCode()) {
                case -1607243192:
                    if (str.equals("endTime")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1367724422:
                    if (str.equals("cancel")) {
                        c = 0;
                        break;
                    }
                    break;
                case 951117504:
                    if (str.equals("confirm")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1282360109:
                    if (str.equals("removePop")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                c.a(this.mUCPSignal, "Cancel", 0, "Cancel");
                c.a(this.mUCPSignal, b.KEY_TERMINAL, 0, "Cancel");
                this.mUCPSignal = null;
                return;
            }
            if (c == 1) {
                c.a(this.mUCPSignal, "Click", 0, "Click");
                c.a(this.mUCPSignal, b.KEY_TERMINAL, 0, "Click");
                this.mUCPSignal = null;
            } else if (c != 2 && c != 3) {
                return;
            }
            c.a(this.mUCPSignal, b.KEY_TERMINAL, 0, b.KEY_TERMINAL);
            this.mUCPSignal = null;
        }
    }

    private void notifyUCPStateIfNeed(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587ce851", new Object[]{this, new Integer(i)});
            return;
        }
        b bVar = this.mUCPSignal;
        if (bVar == null) {
            return;
        }
        if (i == 0) {
            c.a(bVar, "Click", 0, "Click");
            c.a(this.mUCPSignal, b.KEY_TERMINAL, 0, "Click");
            this.mUCPSignal = null;
        } else if (i == 1) {
            c.a(bVar, "Cancel", 0, "Cancel");
            c.a(this.mUCPSignal, b.KEY_TERMINAL, 0, "Cancel");
            this.mUCPSignal = null;
            return;
        } else if (i != 2) {
            return;
        }
        c.a(this.mUCPSignal, b.KEY_TERMINAL, 0, b.KEY_TERMINAL);
        this.mUCPSignal = null;
    }
}
