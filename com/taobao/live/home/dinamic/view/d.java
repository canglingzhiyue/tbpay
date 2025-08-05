package com.taobao.live.home.dinamic.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.LiveHomeController;
import com.taobao.live.home.dinamic.model.DinamicDataObject;
import com.taobao.live.home.dinamic.model.TemplateObject;
import com.taobao.taobao.R;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.med;
import tb.meh;
import tb.mfm;
import tb.tio;

/* loaded from: classes7.dex */
public class d extends meh<IMTOPDataObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a h;

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -955520525) {
            super.onViewAttachedToWindow((RecyclerView.ViewHolder) objArr[0]);
            return null;
        } else if (hashCode != 2011695254) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.b((med) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onViewAttachedToWindow(med medVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c70be9f3", new Object[]{this, medVar});
        } else {
            a(medVar);
        }
    }

    public d(Context context, a aVar) {
        super(context);
        this.h = aVar;
    }

    @Override // tb.meh
    public med b(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (med) ipChange.ipc$dispatch("6a5bbaff", new Object[]{this, viewGroup, new Integer(i)});
        }
        b bVar = new b(h(), viewGroup, R.layout.live_dinamic_card_container);
        bVar.a(this.h);
        return bVar;
    }

    @Override // tb.meh
    public void b(med medVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e80896", new Object[]{this, medVar, new Integer(i)});
            return;
        }
        super.b(medVar, i);
        if (mfm.i()) {
            IMTOPDataObject c = c(i);
            if (c instanceof DinamicDataObject) {
                DinamicDataObject dinamicDataObject = (DinamicDataObject) c;
                if (!tio.a(dinamicDataObject.templateName) && dinamicDataObject.data != null && LiveHomeController.a().f() != null) {
                    LiveHomeController.a().f().a(h(), dinamicDataObject.templateName, dinamicDataObject);
                }
            }
        }
        ((b) medVar).a(c(i), i);
    }

    @Override // tb.meh
    public int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.f31042a != null) {
            IMTOPDataObject iMTOPDataObject = (IMTOPDataObject) this.f31042a.get(i);
            if (iMTOPDataObject instanceof DinamicDataObject) {
                DinamicDataObject dinamicDataObject = (DinamicDataObject) iMTOPDataObject;
                if (dinamicDataObject.templateName != null) {
                    TemplateObject a2 = LiveHomeController.a().a(dinamicDataObject.templateName);
                    if (a2 != null) {
                        return a2.hashCode();
                    }
                    return dinamicDataObject.templateName.hashCode();
                }
            }
        }
        return 0;
    }

    public void a(med medVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f452e58c", new Object[]{this, medVar});
            return;
        }
        super.onViewAttachedToWindow(medVar);
        if (this.g == null || !(medVar instanceof b) || this.g.getScrollState() != 0) {
            return;
        }
        b bVar = (b) medVar;
        bVar.f();
        bVar.g();
    }
}
