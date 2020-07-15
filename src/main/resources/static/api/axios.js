function register(event){
    event.preventDefault();
    var name= document.getElementById('name').value;
    var username=document.getElementById('email').value;
    var password=document.getElementById('password').value;
    console.log(password);

  

    axios.post('http://localhost:8080/signup', {
        username: `${username}`,
        password: `${password}`,
        role:"USER"
      })
      .then(function (response) {
        alert('USER REGISTERED');
        window.location.href="/botlogin";
        console.log(response);
      })
      .catch(function (error) {
        console.log(error);
      });

};

function login(event){
	  event.preventDefault();
	  var username=document.getElementById('email').value;
	  var password=document.getElementById('password').value;
	  
	  
	  axios.post('http://localhost:8080/signin',{
	    username: `${username}`,
	    password:`${password}`
	  })
	  .then(function(response){
	    console.log(response.data);
	    if(response.data.role=='USER')
	    	window.location.href="/chatbot";
	    else if(response.data.role=='ADMIN')
	    	window.location.href="/admin";
	    else
	    	alert('Invalid Login');
	  })
	  .catch(function(error){
	    console.log(error)
	  })
	}