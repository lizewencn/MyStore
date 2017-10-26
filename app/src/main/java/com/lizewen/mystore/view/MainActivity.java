package com.lizewen.mystore.view;

import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.lizewen.mystore.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends BaseActivity {

    @InjectView(R.id.main_container)
    FrameLayout container;

    private HomeFragment homeF;
    @Override
    protected void initView() {
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        homeF = new HomeFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if(!homeF.isAdded()){
            transaction.add(container.getId(),homeF);
        }
        transaction.show(homeF);
        transaction.commit();

    }



    @Override
    protected void initListener() {

    }

    @Override
    protected void iniData() {
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.menu_main_cart) {
            Toast.makeText(this, "通知", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.menu_main_msg) {
            Toast.makeText(this, "购物车", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
