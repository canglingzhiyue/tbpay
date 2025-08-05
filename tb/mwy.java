package tb;

import android.support.v4.util.ArrayMap;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.android.ultron.event.base.f;
import com.alibaba.android.ultron.vfw.instance.d;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class mwy extends RecyclerView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f31305a = "RecyclerViewScrollListenerExposure";
    private final int b = 10;
    private final int c = 0;
    private final int d = -10;
    private int e = 1;
    private int f = 0;
    private int g = 0;
    private int h = 0;
    private ArrayList<IDMComponent> i = new ArrayList<>();
    private f j;

    static {
        kge.a(-1161583517);
    }

    public static /* synthetic */ Object ipc$super(mwy mwyVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 806944192) {
            super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        } else if (hashCode != 2142696127) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
    }

    public mwy(d dVar, RecyclerView recyclerView) {
        this.j = dVar.d();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f = 0;
        this.g = 0;
        c();
        ArrayList<IDMComponent> arrayList = this.i;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        super.onScrolled(recyclerView, i, i2);
        this.e += i2;
        int i3 = this.e;
        if (i3 <= 10 && i3 >= -10) {
            return;
        }
        this.e = 0;
        a(recyclerView);
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
        } else {
            super.onScrollStateChanged(recyclerView, i);
        }
    }

    public void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
        } else if (recyclerView == null || !(recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
        } else {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            int i = findLastVisibleItemPosition;
            while (true) {
                if (i <= 0) {
                    break;
                } else if (a(i, recyclerView, linearLayoutManager)) {
                    this.g = i;
                    break;
                } else {
                    i--;
                }
            }
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            while (true) {
                if (findFirstVisibleItemPosition > findLastVisibleItemPosition) {
                    break;
                } else if (a(findFirstVisibleItemPosition, recyclerView, linearLayoutManager)) {
                    this.f = findFirstVisibleItemPosition;
                    break;
                } else {
                    findFirstVisibleItemPosition++;
                }
            }
            a(b(recyclerView));
        }
    }

    private bnn b(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bnn) ipChange.ipc$dispatch("43a36d2d", new Object[]{this, recyclerView});
        }
        if (recyclerView != null && recyclerView.getAdapter() != null) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter instanceof nkj) {
                adapter = ((nkj) adapter).c();
            }
            if (adapter instanceof bnn) {
                return (bnn) adapter;
            }
        }
        return null;
    }

    private boolean a(int i, RecyclerView recyclerView, RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("687bbffc", new Object[]{this, new Integer(i), recyclerView, layoutManager})).booleanValue();
        }
        if (recyclerView != null && layoutManager != null && i >= 0) {
            if (this.h <= 0) {
                this.h = recyclerView.getHeight();
            }
            View findViewByPosition = layoutManager.findViewByPosition(i);
            if (findViewByPosition != null) {
                int height = findViewByPosition.getHeight();
                int top = findViewByPosition.getTop();
                if (top >= 0) {
                    int height2 = recyclerView.getHeight() - top;
                    if (height2 > 0 && height2 + height2 > height) {
                        return true;
                    }
                } else if (top + top + height > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private void a(bnn bnnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e210f5f6", new Object[]{this, bnnVar});
        } else if (bnnVar != null && bnnVar.getItemCount() > 0) {
            List<IDMComponent> a2 = bnnVar.a();
            for (int i = this.f; i <= this.g && i < a2.size() && i >= 0; i++) {
                IDMComponent iDMComponent = a2.get(i);
                if (a(iDMComponent)) {
                    this.i.add(iDMComponent);
                }
            }
            if (this.i.size() <= 0) {
                return;
            }
            c();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            c();
        }
    }

    private boolean a(IDMComponent iDMComponent) {
        ArrayMap<String, Object> extMap;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e66567f0", new Object[]{this, iDMComponent})).booleanValue();
        }
        if (iDMComponent == null || (extMap = iDMComponent.getExtMap()) == null) {
            return false;
        }
        Object obj = extMap.get(mtp.KEY_EXPOSED_MARK);
        if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
            z = false;
        }
        if (z) {
            b(iDMComponent);
        }
        return z;
    }

    private void b(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73527f0b", new Object[]{this, iDMComponent});
        } else if (iDMComponent == null || iDMComponent.getExtMap() == null) {
        } else {
            iDMComponent.getExtMap().put(mtp.KEY_EXPOSED_MARK, true);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ArrayList<IDMComponent> arrayList = this.i;
        if (arrayList == null || arrayList.size() <= 0 || this.j == null) {
            return;
        }
        mxf.a("commitExposureComponent");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(this.i);
        this.i.clear();
        if (arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                mxb.a((IDMComponent) it.next(), this.j);
            }
        }
        mxf.b("commitExposureComponent");
    }
}
