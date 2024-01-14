let index = {
    init(){
        $("#btn-save").on("click",() => {
           this.save();
        });

    },

    save() {
        let data = {
            title: $("#title").val(),
            content: $("#content").val(),
        };
        //ajax 통신을 통해 3개의 데이터를 json 형식으로 변경하여 insert 요청
        $.ajax({
            type: "POST",            //요청방식
            url: "/api/board",  //호출경로
            data: JSON.stringify(data), //http body 데이터
            contentType: "application/json; charset=utf-8", //body 데이터가 어떤 타입인지를 제시
            dataType: "json"    // 서버로부터 응답 결과의 형태가 json이라면 이를 javascript 오브젝트로 변경
        }).done(function(resp) {    //성공시에는 done
            alert("글쓰기가 완료되었습니다.");
            location.href = "/";
        }).fail(function (error) {   //실패시에는 fail
            alert(JSON.stringify(error));
        });
    }
    };

index.init();

