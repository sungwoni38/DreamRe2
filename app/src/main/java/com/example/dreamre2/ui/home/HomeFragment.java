package com.example.dreamre2.ui.home;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.dreamre2.NotiActivity;
import com.example.dreamre2.R;
import com.example.dreamre2.databinding.FragmentHomeBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import org.jetbrains.annotations.Nullable;

public class HomeFragment extends Fragment implements OnMapReadyCallback, GoogleMap.OnInfoWindowClickListener{

    private View view;
    private FragmentHomeBinding binding;
    private ImageView img_noti;
    MapView sView = null;
    private GoogleMap googleMap;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);


        img_noti = view.findViewById(R.id.img_noti);
        img_noti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent01 = new Intent(getActivity(), NotiActivity.class);
                intent01.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent01);
            }
        });
//mapView 부름
        sView = view.findViewById(R.id.mapView);
        sView.onCreate(savedInstanceState);
        sView.getMapAsync(this);
        return view;
    }
    //이 메서드가 없으면 지도가 보이지 않음
    @Override
    public void onStart() {
        super.onStart();
        sView.onStart();
    }

    @Override
    public void onStop () {
        super.onStop();
        sView.onStop();

    }

    @Override
    public void onSaveInstanceState (@Nullable Bundle outState){
        super.onSaveInstanceState(outState);
        sView.onSaveInstanceState(outState);
    }

    @Override
    public void onResume() {
        super.onResume();
        sView.onResume();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        sView.onLowMemory();
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        LatLng solnae = new LatLng(35.972349, 129.414020);
        LatLng solnae1 = new LatLng(35.14596026, 126.9221043);
        LatLng solnae2 = new LatLng(37.5570177585, 127.090536);
        LatLng solnae3 = new LatLng(37.83166461, 127.0690537);
        LatLng solnae4 = new LatLng(37.544374, 126.837392);
        LatLng solnae5 = new LatLng(36.112805, 129.3434995427);
        LatLng solnae6 = new LatLng(35.62934517, 129.3593207);
        LatLng solnae7 = new LatLng(36.34033566, 127.4348789);
        LatLng solnae8 = new LatLng(35.16359189, 126.9202183);
        LatLng solnae9 = new LatLng(36.041363, 129.365873);
        LatLng solnae10 = new LatLng(35.07999721, 129.0056489);
        LatLng solnae11 = new LatLng(37.79498388, 127.0803453);

        //마커 옵션
        MarkerOptions marker = new MarkerOptions();
        marker.position(solnae); //마커 위치
        marker.title("아바르김밥");
        marker.snippet("경상북도 포항시 남구 오천읍 용덕리 313-10");

        MarkerOptions marker1 = new MarkerOptions();
        marker1.position(solnae1); //마커 위치
        marker1.title("파리바게뜨 광주광역시서석점");
        marker1.snippet("광주광역시 동구 서석동 50-4");

        MarkerOptions marker2 = new MarkerOptions();
        marker2.position(solnae2); //마커 위치
        marker2.title("하비스트로프제과점");
        marker2.snippet("서울특별시 광진구 (중곡동 88-6)");

        MarkerOptions marker3 = new MarkerOptions();
        marker3.position(solnae3); //마커 위치
        marker3.title("유로코피자 양주1호");
        marker3.snippet("경기도 양주시 고암길 54, 1층 109호 (고암동, 동아프라자)");


        MarkerOptions marker4 = new MarkerOptions();
        marker4.position(solnae4); //마커 위치
        marker4.title("한우리네칼국수");
        marker4.snippet("서울특별시 강서구 강서로 207, 1층");


        MarkerOptions marker5 = new MarkerOptions();
        marker5.position(solnae5); //마커 위치
        marker5.title("흥해국밥");
        marker5.snippet("경상북도 포항시 북구 흥해읍 마산리 60-4");


        MarkerOptions marker6 = new MarkerOptions();
        marker6.position(solnae6); //마커 위치
        marker6.title("강원꿀꿀순대");
        marker6.snippet("울산광역시 북구 동대로 69-2");


        MarkerOptions marker7 = new MarkerOptions();
        marker7.position(solnae7); //마커 위치
        marker7.title("김밥지존");
        marker7.snippet("대전광역시 동구 성남동 155-27");


        MarkerOptions marker8 = new MarkerOptions();
        marker8.position(solnae8); //마커 위치
        marker8.title("피자마루");
        marker8.snippet("광주광역시 동구 계림동 100-11");


        MarkerOptions marker9 = new MarkerOptions();
        marker9.position(solnae9); //마커 위치
        marker9.title("민속죽집");
        marker9.snippet("경상북도 포항시 북구 덕산동 121-4");


        MarkerOptions marker10 = new MarkerOptions();
        marker10.position(solnae10); //마커 위치
        marker10.title("GS25 감천한일점");
        marker10.snippet("부산광역시 사하구 원양로 324, (감천동)");

        MarkerOptions marker11 = new MarkerOptions();
        marker11.position(solnae10); //마커 위치
        marker11.title("홍참치");
        marker11.snippet("경기도 양주시 고읍남로 13, 103호 (광사동)");

        //맵에 마커표시, 인포윈도우 보여줌
        googleMap.addMarker(marker).showInfoWindow();
        googleMap.addMarker(marker2).showInfoWindow();
        googleMap.addMarker(marker3).showInfoWindow();
        googleMap.addMarker(marker4).showInfoWindow();
        googleMap.addMarker(marker5).showInfoWindow();
        googleMap.addMarker(marker6).showInfoWindow();
        googleMap.addMarker(marker7).showInfoWindow();
        googleMap.addMarker(marker8).showInfoWindow();
        googleMap.addMarker(marker9).showInfoWindow();
        googleMap.addMarker(marker10).showInfoWindow();
        //인포윈도우 클릭
        googleMap.setOnInfoWindowClickListener(this);

        //맵뷰 카메라위치, 줌 설정
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(solnae, 6));
    }

    public static final int MY_PERMISSIONS_REQUEST_LOCATION = 99;

    private void checkLocationPermissionWithRationale() {
        if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(getActivity(), Manifest.permission.ACCESS_FINE_LOCATION)) {
                new AlertDialog.Builder(getActivity())
                        .setTitle("위치정보")
                        .setMessage("이 앱을 사용하기 위해서는 위치정보에 접근이 필요합니다. 위치정보 접근을 허용하여 주세요.")
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, MY_PERMISSIONS_REQUEST_LOCATION);
                            }
                        }).create().show();
            } else {
                ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, MY_PERMISSIONS_REQUEST_LOCATION);
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_LOCATION: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
                        googleMap.setMyLocationEnabled(true);
                    }
                } else {
                    Toast.makeText(getActivity(), "permission denied", Toast.LENGTH_LONG).show();
                }
                return;
            }
        }
    }

    @Override
    public void onInfoWindowClick(@NonNull Marker marker) {

    }
}