let index = {
    init(){
        $("#btn-save").on("click",() => {
           this.save();
        });
        // $("#btn-login").on("click",() =>{
        //     this.login();
        // })
    },

    save(){
        let data = {
            username: $("#username").val(),
            password: $("#password").val(),
            email: $("#email").val(),
        };
        console.log(data);
        //ajax 통신을 통해 3개의 데이터를 json 형식으로 변경하여 insert 요청
        $.ajax({
            type:"POST",            //요청방식
            url: "/auth/joinProc",  //호출경로
            data: JSON.stringify(data), //http body 데이터
            contentType: "application/json; charset=utf-8", //body 데이터가 어떤 타입인지를 제시
            dataType: "json"    // 서버로부터 응답 결과의 형태가 json이라면 이를 javascript 오브젝트로 변경
        }).done(function (resp){    //성공시에는 done
            if(resp.status == 500) {
                alert("회원가입에 실패하였습니다.");
            }else {
                alert("회원가입이 완료되었습니다.")
                console.log(resp);
                location.href = "/blog";
            }
        }).fail(function (error){   //실패시에는 fail
            alert(JSON.stringify(error));
        });

    },
    // login(){
    //     let data = {
    //         username: $("#username").val(),
    //         password: $("#password").val(),
    //     };
    //     console.log(data);
    //     //ajax 통신을 통해 3개의 데이터를 json 형식으로 변경하여 insert 요청
    //     $.ajax({
    //         type:"POST",            //요청방식
    //         url: "/blog/api/user/login",  //호출경로
    //         data: JSON.stringify(data), //http body 데이터
    //         contentType: "application/json; charset=utf-8", //body 데이터가 어떤 타입인지를 제시
    //         dataType: "json"    // 서버로부터 응답 결과의 형태가 json이라면 이를 javascript 오브젝트로 변경
    //     }).done(function (resp){    //성공시에는 done
    //         alert("로그인이 완료되었습니다.");
    //         location.href="/blog";
    //     }).fail(function (error){   //실패시에는 fail
    //         alert(JSON.stringify(error));
    //     });
    // },
};

index.init();

